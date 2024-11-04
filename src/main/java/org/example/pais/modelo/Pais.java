package org.example.pais.modelo;

public class Pais {

    private int country_id = 0;
    private String name = "";
    private String iso = "";
    private String capital = "";
    private String region = "";
    private int population = 0;
    private double area_km2 = 0;
    private double gdp_per_capita = 0;
    private String currency = "";

    public Pais(int country_id, String name, String iso, String capital, String region, int population, double area_km2, double gdp_per_capita, String currency) {
        this.country_id = country_id;
        this.name = name;
        this.iso = iso;
        this.capital = capital;
        this.region = region;
        this.population = population;
        this.area_km2 = area_km2;
        this.gdp_per_capita = gdp_per_capita;
        this.currency = currency;
    }

    public double getArea_km2() {
        return area_km2;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public void setArea_km2(double area_km2) {
        this.area_km2 = area_km2;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getGdp_per_capita() {
        return gdp_per_capita;
    }

    public void setGdp_per_capita(double gdp_per_capita) {
        this.gdp_per_capita = gdp_per_capita;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "country_id=" + country_id +
                ", name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", region='" + region + '\'' +
                ", population=" + population +
                ", area_km2=" + area_km2 +
                ", gdp_per_capita=" + gdp_per_capita +
                ", currency='" + currency + '\'' +
                '}';
    }
}
