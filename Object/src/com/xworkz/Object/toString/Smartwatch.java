package com.xworkz.Object.toString;

public class Smartwatch {
        private String brand;
        private boolean gps;
        private int batteryLife;

        public Smartwatch(String brand, boolean gps, int batteryLife) {
            this.brand = brand;
            this.gps = gps;
            this.batteryLife = batteryLife;
        }

        @Override
        public String toString() {
            return "Smartwatch{brand='" + brand + "', gps=" + gps + ", batteryLife=" + batteryLife + "}";
        }
    @Override
    public int hashCode() {
        return 65;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Smartwatch) {
                System.out.println("Comparing!!!!!!");
                Smartwatch smartwatch = this;
                Smartwatch smartwatch1 = (Smartwatch) obj;
                if (smartwatch.brand.equals(smartwatch1.brand) && smartwatch.gps==(smartwatch1.gps) && smartwatch.batteryLife == smartwatch1.batteryLife) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }


}
