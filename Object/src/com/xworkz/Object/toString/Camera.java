package com.xworkz.Object.toString;

    public class Camera {
        private String brand;
        private int resolution;
        private double price;

        public Camera(String brand, int resolution, double price) {
            this.brand = brand;
            this.resolution = resolution;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Camera{brand='" + brand + "', resolution=" + resolution + ", price=" + price + "}";
        }
    }

