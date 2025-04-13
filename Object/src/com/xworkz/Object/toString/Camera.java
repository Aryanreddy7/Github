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
        @Override
        public int hashCode() {
            return 11;
        }
        @Override
        public boolean equals(Object obj) {
            if(obj != null) {
                System.out.println("ref is not null");
                if(obj instanceof Camera) {
                    System.out.println("Comparing!!!!!!");
                    Camera camera = this;
                    Camera camera1 = (Camera) obj;
                    if(camera.brand.equals(camera1.brand)) {
                        System.out.println("both are same");
                        return true;
                    }
                }
            }
            return false;
        }

    }

