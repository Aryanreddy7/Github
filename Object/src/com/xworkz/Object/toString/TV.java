package com.xworkz.Object.toString;

public class TV {
        private String brand;
        private int size;
        private boolean smart;

        public TV(String brand, int size, boolean smart) {
            this.brand = brand;
            this.size = size;
            this.smart = smart;
        }

        @Override
        public String toString() {
            return "TV{brand='" + brand + "', size=" + size + ", smart=" + smart + "}";
        }
    }
