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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Watch) {
                System.out.println("Comparing!!!!!!");
                Watch watch = this;
                Watch watch1 = (Watch) obj;
                if (watch.brand.equals(watch1.brand) && watch.material==watch1.material && watch.price == watch1.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
