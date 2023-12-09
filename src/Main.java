import payload.CountryDTO;
import payload.RegionDTO;
import service.CountryServiceImpl;
import service.RegionServiceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
   private static CountryServiceImpl countryService=CountryServiceImpl.getInstance();
   private  static RegionServiceImpl regionService=RegionServiceImpl.getInstance();
    public static void main(String[] args) {
        //variant 1
        //Github
        //
        List<RegionDTO>regionDTOS=new ArrayList<>();
        regionDTOS.add(regionService.addRegion(
                new RegionDTO(
                        5,
                        "tt",
                        "yy")));
     countryService.addCountry(
             new CountryDTO(
                     4,"rr",
                     "gg","uu",
                     LocalDate.now(),5.6,regionDTOS));
       countryService.serialize();
       List<CountryDTO>countries=countryService.desrialize();
        System.out.println(countries);
    }
}
