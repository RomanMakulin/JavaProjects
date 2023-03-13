package org.example;

public class City {
    protected int id;
    protected String cityName;
    protected String regionName;
    protected String federalName;
    protected int peopleNumber;
    protected String createDate;

    public City(int id, String cityName, String regionName, String federalName, int peopleNumber, String createDate) {
        this.id = id;
        this.cityName = cityName;
        this.regionName = regionName;
        this.federalName = federalName;
        this.peopleNumber = peopleNumber;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getFederalName() {
        return federalName;
    }

    public void setFederalName(String federalName) {
        this.federalName = federalName;
    }

    public int getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(int peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

//    @Override
//    public String toString() {
//        return "City{" +
//                "name='" + cityName + '\'' +
//                ", region='" + regionName + '\'' +
//                ", district='" + regionName + '\'' +
//                ", population=" + peopleNumber +
//                ", foundation='" + createDate + '\'' +
//                '}';
//    }
}
