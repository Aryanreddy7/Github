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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof WeatherReport) {
                System.out.println("Comparing!!!!!!");
                WeatherReport weatherReport = this;
                WeatherReport weatherReport1 = (WeatherReport) obj;
                if (weatherReport.date.equals(weatherReport1.date) && weatherReport.temperature == weatherReport1.temperature && weatherReport.condition.equals(weatherReport1.condition)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
