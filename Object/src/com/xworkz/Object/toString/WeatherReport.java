package com.xworkz.Object.toString;

public class WeatherReport {
    private String date;
    private double temperature;
    private String condition;

    public WeatherReport(String date, double temperature, String condition) {
        this.date = date;
        this.temperature = temperature;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "WeatherReport{date='" + date + "', temperature=" + temperature + ", condition='" + condition + "'}";
    }
    @Override
    public int hashCode() {
        return 99;
    }
}
