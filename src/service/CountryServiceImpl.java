package service;

import payload.CountryDTO;
import payload.RegionDTO;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.*;

public class CountryServiceImpl implements  CountryService{
    private  static Lock lock=new ReentrantLock();
    private Logger logger;

    private CountryServiceImpl(){
        logger=Logger.getLogger("CountryLogger ");
        try {
            Handler handler=new FileHandler("logger.txt",true);
            handler.setFormatter(new SimpleFormatter());
            logger.addHandler(handler);
        }catch (Exception e){
            throw  new RuntimeException(e);
        }
    }

    private  static  CountryServiceImpl instance;

    public static CountryServiceImpl getInstance() {
     if(instance==null){
         lock.lock();
         if(instance==null)
             instance=new CountryServiceImpl();
         lock.unlock();
     }return  instance;
    }
List<CountryDTO>list= Collections.synchronizedList(new ArrayList<>());
    @Override
    public List<RegionDTO> getRegionByCountryID(Integer countryID) {
        logger.log(Level.INFO,"getRegionByCountryID ishladi");
     return   findCountryByID(countryID).getRegionsDTO();
    }

    @Override
    public CountryDTO getCountryByCountryID(Integer countryID) {
        logger.log(Level.INFO,"getCountryByCountryID ishladi");
        return findCountryByID(countryID);
    }

    @Override
    public CountryDTO addCountry(CountryDTO countryDTO) {
        logger.log(Level.INFO,"addCountry ishladi");
        countryDTO.setCountryID_numberDTO(list.size()+1);
        list.add(countryDTO);
        return countryDTO;
    }

    @Override
    public CountryDTO editeCountry(Integer countryID, CountryDTO countryDTO) {
        CountryDTO countryNew=findCountryByID(countryID);
        logger.log(Level.INFO,"editeCountry ishladi");
        countryNew.setCountryNameDTO(countryDTO.getCountryNameDTO());
        countryNew.setCountryID_numberDTO(countryDTO.getCountryID_numberDTO());
        countryNew.setCountrySquareDTO(countryDTO.getCountrySquareDTO());
        countryNew.setCountryFlagUrlDTO(countryDTO.getCountryFlagUrlDTO());
        countryNew.setCountryDescriptionFilePathDTO(countryDTO.getCountryDescriptionFilePathDTO());
        countryNew.setCountryEslablishmentDateDTO(countryDTO.getCountryEslablishmentDateDTO());
        countryNew.setRegionsDTO(countryDTO.getRegionsDTO());
        return countryNew;
    }

    @Override
    public boolean deleteCountry(Integer countryID) {
        logger.log(Level.INFO,"deleteCountryishladi");
        return list.remove(findCountryByID(countryID));
    }

    @Override
    public String readCountry(Integer countryID) {
        CountryDTO country=findCountryByID(countryID);
        try {
            InputStream input=new FileInputStream(country.getCountryDescriptionFilePathDTO());
            byte[]bytes=input.readAllBytes();
            logger.log(Level.INFO,"readCountry ishladi");
            return  new String(bytes);
        }catch (Exception e){
            logger.log(Level.INFO,"readCountry ishlamadi");
            throw  new RuntimeException(e);
        }

    }

    @Override
    public List<CountryDTO> serialize() {
        try(ObjectOutputStream output =new ObjectOutputStream(new FileOutputStream("tt.txt"))) {
            logger.log(Level.INFO,"serialize ishladi");
            output.writeObject(list);
            return  list;
        }catch (Exception e){
            logger.log(Level.INFO,"serialize ishlamadi");
            throw  new RuntimeException(e);
        }
    }

    @Override
    public List<CountryDTO> desrialize() {
       try(ObjectInputStream input=new ObjectInputStream(new FileInputStream("tt.txt"))) {
          list=(List<CountryDTO>) input.readObject();
           logger.log(Level.INFO,"deserialize ishladi");
          return  list;
       }catch (Exception e){
           logger.log(Level.INFO,"deserialize ishlamadi");
           throw  new RuntimeException(e);
       }
    }
    private  CountryDTO findCountryByID(Integer countryID){
        return  list.stream()
                .filter(s->s.getCountryID_numberDTO().equals(countryID))
                .findFirst()
                .orElseThrow();
    }

}
