package com.xworkz.Object.toString;

public class Printer {
        private String brand;
        private String type;
        private boolean wireless;

        public Printer(String brand, String type, boolean wireless) {
            this.brand = brand;
            this.type = type;
            this.wireless = wireless;
        }

        @Override
        public String toString() {
            return "Printer{brand='" + brand + "', type='" + type + "', wireless=" + wireless + "}";
        }
    @Override
    public int hashCode() {
        return 61;
    }
    }
