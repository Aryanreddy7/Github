package com.xworkz.Object.toString;

public class Microwave {
        private String brand;
        private int power;
        private boolean convection;

        public Microwave(String brand, int power, boolean convection) {
            this.brand = brand;
            this.power = power;
            this.convection = convection;
        }

        @Override
        public String toString() {
            return "Microwave{brand='" + brand + "', power=" + power + ", convection=" + convection + "}";
        }
    @Override
    public int hashCode() {
        return 46;
    }
    }
