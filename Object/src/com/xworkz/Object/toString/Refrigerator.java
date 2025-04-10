package com.xworkz.Object.toString;

public class Refrigerator {
        private String brand;
        private int capacity;
        private boolean doubleDoor;

        public Refrigerator(String brand, int capacity, boolean doubleDoor) {
            this.brand = brand;
            this.capacity = capacity;
            this.doubleDoor = doubleDoor;
        }

        @Override
        public String toString() {
            return "Refrigerator{brand='" + brand + "', capacity=" + capacity + ", doubleDoor=" + doubleDoor + "}";
        }
    }
