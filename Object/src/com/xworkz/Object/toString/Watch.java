package com.xworkz.Object.toString;

public class Watch {
        private String brand;
        private String material;
        private double price;

        public Watch(String brand, String material, double price) {
            this.brand = brand;
            this.material = material;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Watch{brand='" + brand + "', material='" + material + "', price=" + price + "}";
        }
    @Override
    public int hashCode() {
        return 98;
    }
    }
