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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Microwave) {
                System.out.println("Comparing!!!!!!");
                Microwave microwave = this;
                Microwave microwave1 = (Microwave) obj;
                if (microwave.brand.equals(microwave1.brand) && microwave.power == microwave1.power) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
