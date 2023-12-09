package service;

import payload.CountryDTO;
import payload.RegionDTO;

import java.util.List;

public interface CountryService {
    //1
    List<RegionDTO>getRegionByCountryID(Integer countryID);
    //2
    CountryDTO getCountryByCountryID(Integer countryID);
    //3
    CountryDTO addCountry(CountryDTO countryDTO);
    //4
    CountryDTO editeCountry(Integer countryID,CountryDTO countryDTO);
    //5
    boolean deleteCountry(Integer countryID);
    //6
    String readCountry(Integer countryID);
    //7
    List<CountryDTO>serialize();
    //8
   List<CountryDTO>desrialize();


}
