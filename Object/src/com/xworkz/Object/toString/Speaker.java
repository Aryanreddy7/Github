package com.xworkz.Object.toString;

public class Speaker {
        private String brand;
        private int power;
        private boolean bluetooth;

        public Speaker(String brand, int power, boolean bluetooth) {
            this.brand = brand;
            this.power = power;
            this.bluetooth = bluetooth;
        }

        @Override
        public String toString() {
            return "Speaker{brand='" + brand + "', power=" + power + ", bluetooth=" + bluetooth + "}";
        }
    }
