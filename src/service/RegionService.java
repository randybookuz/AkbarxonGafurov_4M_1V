package service;

import payload.RegionDTO;

import java.util.List;

public interface RegionService {
    List<RegionDTO>showAllRegions();
    RegionDTO addRegion(RegionDTO regionDTO);
    RegionDTO editeRegion(Integer regionID,RegionDTO regionDTO);

    boolean deleteRegion(Integer regionID);
    RegionDTO findOrThrow(Integer regionID);

}
