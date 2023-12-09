package entity;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Country implements Serializable {
    private Integer countryID_number;
    private String countryName;
    private String countryFlagUrl;
    private  String countryDescriptionFilePath;
    private LocalDate countryEslablishmentDate;
    private  double countrySquare;
    private List<Region>regions;

    public Country(Integer countryID_number, String countryName, String countryFlagUrl, String countryDescriptionFilePath, LocalDate countryEslablishmentDate, double countrySquare, List<Region> regions) {
        this.countryID_number = countryID_number;
        this.countryName = countryName;
        this.countryFlagUrl = countryFlagUrl;
        this.countryDescriptionFilePath = countryDescriptionFilePath;
        this.countryEslablishmentDate = countryEslablishmentDate;
        this.countrySquare = countrySquare;
        this.regions = regions;
    }

    public Integer getCountryID_number() {
        return countryID_number;
    }

    public void setCountryID_number(Integer countryID_number) {
        this.countryID_number = countryID_number;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryFlagUrl() {
        return countryFlagUrl;
    }

    public void setCountryFlagUrl(String countryFlagUrl) {
        this.countryFlagUrl = countryFlagUrl;
    }

    public String getCountryDescriptionFilePath() {
        return countryDescriptionFilePath;
    }

    public void setCountryDescriptionFilePath(String countryDescriptionFilePath) {
        this.countryDescriptionFilePath = countryDescriptionFilePath;
    }

    public LocalDate getCountryEslablishmentDate() {
        return countryEslablishmentDate;
    }

    public void setCountryEslablishmentDate(LocalDate countryEslablishmentDate) {
        this.countryEslablishmentDate = countryEslablishmentDate;
    }

    public double getCountrySquare() {
        return countrySquare;
    }

    public void setCountrySquare(double countrySquare) {
        this.countrySquare = countrySquare;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryID_number=" + countryID_number +
                ", countryName='" + countryName + '\'' +
                ", countryFlagUrl='" + countryFlagUrl + '\'' +
                ", countryDescriptionFilePath='" + countryDescriptionFilePath + '\'' +
                ", countryEslablishmentDate=" + countryEslablishmentDate +
                ", countrySquare=" + countrySquare +
                ", regions=" + regions +
                '}';
    }
}