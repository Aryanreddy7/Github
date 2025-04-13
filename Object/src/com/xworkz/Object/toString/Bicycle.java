package com.xworkz.Object.toString;

public class Bicycle {
        private String type;
        private String color;
        private double weight;

        public Bicycle(String type, String color, double weight) {
            this.type = type;
            this.color = color;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Bicycle{type='" + type + "', color='" + color + "', weight=" + weight + "}";
        }
    @Override
    public int hashCode() {
        return 07;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Bicycle) {
                System.out.println("Comparing!!!!!!");
                Bicycle bicycle = this;
                Bicycle bicycle1 = (Bicycle) obj;
                if(bicycle.type.equals(bicycle1.type)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
    }
