package service;

import payload.RegionDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.*;

public class RegionServiceImpl implements  RegionService{
    private  static Lock lock=new ReentrantLock();
    private Logger logger;
    private  RegionServiceImpl(){
        logger=Logger.getLogger("RegionLogger ");
        try {
            Handler handler=new FileHandler("logger.txt",true);
            handler.setFormatter(new SimpleFormatter());
            logger.addHandler(handler);
        }catch (Exception e){
            throw  new RuntimeException(e);
        }
    }
    private  static RegionServiceImpl instance;

    public static RegionServiceImpl getInstance() {
        if(instance==null){
            lock.lock();
            if(instance==null)
                instance=new RegionServiceImpl();
            lock.unlock();
        }return  instance;
    }
List<RegionDTO>list= Collections.synchronizedList(new ArrayList<>());
    @Override
    public List<RegionDTO> showAllRegions() {
        logger.log(Level.INFO," showAllRegions Ishladi");
        return list;
    }

    @Override
    public RegionDTO addRegion(RegionDTO regionDTO) {
        logger.log(Level.INFO,"addRegion Ishladi");
        regionDTO.setRegionId_numberDTO(list.size()+1);
        list.add(regionDTO);
        return regionDTO;
    }

    @Override
    public RegionDTO editeRegion(Integer regionID, RegionDTO regionDTO) {
        logger.log(Level.INFO," editeRegion Ishladi");
       RegionDTO regionNew= findOrThrow(regionID);
       regionNew.setRegionNameDTO(regionDTO.getRegionNameDTO());
       regionNew.setRegionCountryDTO(regionDTO.getRegionCountryDTO());
        return regionNew;
    }

    @Override
    public boolean deleteRegion(Integer regionID) {
        logger.log(Level.INFO,"deleteRegion Ishladi");
        return list.remove(findOrThrow(regionID));
    }

    @Override
    public RegionDTO findOrThrow(Integer regionID) {
        logger.log(Level.INFO,"findOrThrow Ishladi");
        return list.stream()
                .filter(s->s.getRegionId_numberDTO().equals(regionID))
                .findFirst()
                .orElseThrow();
    }
}
