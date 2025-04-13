package com.xworkz.Object.toString;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{make='" + make + "', model='" + model + "', year=" + year + "}";
    }
    @Override
    public int hashCode() {
        return 12;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Car) {
                System.out.println("Comparing!!!!!!");
                Car car = this;
                Car car1 = (Car) obj;
                if(car.model.equals(car1.model)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
