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
    @Override
    public int hashCode() {
        return 79;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof TV) {
                System.out.println("Comparing!!!!!!");
                TV tv = this;
                TV tv1 = (TV) obj;
                if (tv.brand.equals(tv1.brand) && tv.size == tv1.size && tv.smart==tv1.smart) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
