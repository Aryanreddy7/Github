package com.xworkz.Object.toString;

public class VacuumCleaner {
        private String brand;
        private String type;
        private int power;

        public VacuumCleaner(String brand, String type, int power) {
            this.brand = brand;
            this.type = type;
            this.power = power;
        }

        @Override
        public String toString() {
            return "VacuumCleaner{brand='" + brand + "', type='" + type + "', power=" + power + "}";
        }
    @Override
    public int hashCode() {
        return 81;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof VacuumCleaner) {
                System.out.println("Comparing!!!!!!");
                VacuumCleaner vacuumCleaner = this;
                VacuumCleaner vacuumCleaner1 = (VacuumCleaner) obj;
                if (vacuumCleaner.brand.equals(vacuumCleaner1.brand) && vacuumCleaner.type.equals(vacuumCleaner1.type) && vacuumCleaner.power == vacuumCleaner1.power) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
