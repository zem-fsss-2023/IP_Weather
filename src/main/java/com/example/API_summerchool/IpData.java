package com.example.API_summerchool;

public class IpData {

    private String ip;
    private String City;
    private String latitude;
    private String langitude;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLangitude() {
        return langitude;
    }

    public void setLangitude(String langitude) {
        this.langitude = langitude;
    }

    public IpData(String ip, String city, String latitude, String langitude) {
        this.ip = ip;
        City = city;
        this.latitude = latitude;
        this.langitude = langitude;
    }
}
