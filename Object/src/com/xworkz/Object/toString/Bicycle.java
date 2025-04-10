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
    }
