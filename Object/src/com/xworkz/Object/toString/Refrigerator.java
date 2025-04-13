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
    @Override
    public int hashCode() {
        return 62;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Refrigerator) {
                System.out.println("Comparing!!!!!!");
                Refrigerator refrigerator = this;
                Refrigerator refrigerator1 = (Refrigerator) obj;
                if (refrigerator.brand.equals(refrigerator1.brand) && refrigerator.capacity == refrigerator1.capacity && refrigerator.doubleDoor==refrigerator1.doubleDoor) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
