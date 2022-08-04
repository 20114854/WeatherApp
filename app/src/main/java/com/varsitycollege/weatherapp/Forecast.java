package com.varsitycollege.weatherapp;

public class Forecast
{
    public String getfDate() {
        return fDate;
    }

    public void setfDate(String fDate) {
        this.fDate = fDate;
    }

    public String getfMax() {
        return fMax;
    }

    public void setfMax(String fMax) {
        this.fMax = fMax;
    }

    public String getfMin() {
        return fMin;
    }

    public void setfMin(String fMin) {
        this.fMin = fMin;
    }

    public String getfLink() {
        return fLink;
    }

    public void setfLink(String fLink) {
        this.fLink = fLink;
    }

    private String fDate;
    private String fMax;
    private String fMin;
    private String fLink;

}
