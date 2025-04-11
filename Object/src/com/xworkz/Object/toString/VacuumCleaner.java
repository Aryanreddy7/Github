package com.xworkz.Object.toString;

public class VacuumCleaner {
        private String brand;
        private String type;
        private int power;

        public VacuumCleaner(String brand, String type, int power) {
            this.brand = brand;
            this.type = type;
            this.power = power;
        }

        @Override
        public String toString() {
            return "VacuumCleaner{brand='" + brand + "', type='" + type + "', power=" + power + "}";
        }
    @Override
    public int hashCode() {
        return 81;
    }
    }
