package payload;

import java.io.Serializable;

public class RegionDTO implements Serializable {
    private Integer regionId_numberDTO;
    private   String regionNameDTO;
    private  String regionCountryDTO;

    public RegionDTO(Integer regionId_numberDTO, String regionNameDTO, String regionCountryDTO) {
        this.regionId_numberDTO = regionId_numberDTO;
        this.regionNameDTO = regionNameDTO;
        this.regionCountryDTO = regionCountryDTO;
    }

    public Integer getRegionId_numberDTO() {
        return regionId_numberDTO;
    }

    public void setRegionId_numberDTO(Integer regionId_numberDTO) {
        this.regionId_numberDTO = regionId_numberDTO;
    }

    public String getRegionNameDTO() {
        return regionNameDTO;
    }

    public void setRegionNameDTO(String regionNameDTO) {
        this.regionNameDTO = regionNameDTO;
    }

    public String getRegionCountryDTO() {
        return regionCountryDTO;
    }

    public void setRegionCountryDTO(String regionCountryDTO) {
        this.regionCountryDTO = regionCountryDTO;
    }

    @Override
    public String toString() {
        return "RegionDTO{" +
                "regionId_numberDTO=" + regionId_numberDTO +
                ", regionNameDTO='" + regionNameDTO + '\'' +
                ", regionCountryDTO='" + regionCountryDTO + '\'' +
                '}';
    }
}
