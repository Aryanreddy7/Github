package com.xworkz.Object.toString;

public class AirConditioner {
        private String brand;
        private int tonnage;
        private String type;

        public AirConditioner(String brand, int tonnage, String type) {
            this.brand = brand;
            this.tonnage = tonnage;
            this.type = type;
        }

        @Override
        public String toString() {
            return "AirConditioner{brand='" + brand + "', tonnage=" + tonnage + ", type='" + type + "'}";
        }
    }
