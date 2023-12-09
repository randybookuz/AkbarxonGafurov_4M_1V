package payload;

import entity.Region;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class CountryDTO implements Serializable {
    private Integer countryID_numberDTO;
    private String countryNameDTO;
    private String countryFlagUrlDTO;
    private  String countryDescriptionFilePathDTO;
    private LocalDate countryEslablishmentDateDTO;
    private  double countrySquareDTO;
    private List<RegionDTO>regionsDTO;

    public CountryDTO(Integer countryID_numberDTO, String countryNameDTO, String countryFlagUrlDTO, String countryDescriptionFilePathDTO, LocalDate countryEslablishmentDateDTO, double countrySquareDTO, List<RegionDTO> regionsDTO) {
        this.countryID_numberDTO = countryID_numberDTO;
        this.countryNameDTO = countryNameDTO;
        this.countryFlagUrlDTO = countryFlagUrlDTO;
        this.countryDescriptionFilePathDTO = countryDescriptionFilePathDTO;
        this.countryEslablishmentDateDTO = countryEslablishmentDateDTO;
        this.countrySquareDTO = countrySquareDTO;
        this.regionsDTO = regionsDTO;
    }

    public Integer getCountryID_numberDTO() {
        return countryID_numberDTO;
    }

    public void setCountryID_numberDTO(Integer countryID_numberDTO) {
        this.countryID_numberDTO = countryID_numberDTO;
    }

    public String getCountryNameDTO() {
        return countryNameDTO;
    }

    public void setCountryNameDTO(String countryNameDTO) {
        this.countryNameDTO = countryNameDTO;
    }

    public String getCountryFlagUrlDTO() {
        return countryFlagUrlDTO;
    }

    public void setCountryFlagUrlDTO(String countryFlagUrlDTO) {
        this.countryFlagUrlDTO = countryFlagUrlDTO;
    }

    public String getCountryDescriptionFilePathDTO() {
        return countryDescriptionFilePathDTO;
    }

    public void setCountryDescriptionFilePathDTO(String countryDescriptionFilePathDTO) {
        this.countryDescriptionFilePathDTO = countryDescriptionFilePathDTO;
    }

    public LocalDate getCountryEslablishmentDateDTO() {
        return countryEslablishmentDateDTO;
    }

    public void setCountryEslablishmentDateDTO(LocalDate countryEslablishmentDateDTO) {
        this.countryEslablishmentDateDTO = countryEslablishmentDateDTO;
    }

    public double getCountrySquareDTO() {
        return countrySquareDTO;
    }

    public void setCountrySquareDTO(double countrySquareDTO) {
        this.countrySquareDTO = countrySquareDTO;
    }

    public List<RegionDTO> getRegionsDTO() {
        return regionsDTO;
    }

    public void setRegionsDTO(List<RegionDTO> regionsDTO) {
        this.regionsDTO = regionsDTO;
    }

    @Override
    public String toString() {
        return "CountryDTO{" +
                "countryID_numberDTO=" + countryID_numberDTO +
                ", countryNameDTO='" + countryNameDTO + '\'' +
                ", countryFlagUrlDTO='" + countryFlagUrlDTO + '\'' +
                ", countryDescriptionFilePathDTO='" + countryDescriptionFilePathDTO + '\'' +
                ", countryEslablishmentDateDTO=" + countryEslablishmentDateDTO +
                ", countrySquareDTO=" + countrySquareDTO +
                ", regionsDTO=" + regionsDTO +
                '}';
    }
}
