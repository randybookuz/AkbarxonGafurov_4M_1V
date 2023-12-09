package entity;

import java.io.Serializable;

public class Region implements Serializable {
    private Integer regionId_number;
    private   String regionName;
    private  String regionCountry;

    public Region(Integer regionId_number, String regionName, String regionCountry) {
        this.regionId_number = regionId_number;
        this.regionName = regionName;
        this.regionCountry = regionCountry;
    }

    public Integer getRegionId_number() {
        return regionId_number;
    }

    public void setRegionId_number(Integer regionId_number) {
        this.regionId_number = regionId_number;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionCountry() {
        return regionCountry;
    }

    public void setRegionCountry(String regionCountry) {
        this.regionCountry = regionCountry;
    }

    @Override
    public String toString() {
        return "Region{" +
                "regionId_number=" + regionId_number +
                ", regionName='" + regionName + '\'' +
                ", regionCountry='" + regionCountry + '\'' +
                '}';
    }
}
