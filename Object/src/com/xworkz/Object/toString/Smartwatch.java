package com.xworkz.Object.toString;

public class Smartwatch {
        private String brand;
        private boolean gps;
        private int batteryLife;

        public Smartwatch(String brand, boolean gps, int batteryLife) {
            this.brand = brand;
            this.gps = gps;
            this.batteryLife = batteryLife;
        }

        @Override
        public String toString() {
            return "Smartwatch{brand='" + brand + "', gps=" + gps + ", batteryLife=" + batteryLife + "}";
        }
    @Override
    public int hashCode() {
        return 65;
    }
    }
