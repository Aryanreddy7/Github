package com.xworkz.Object.toString;

public class Phone {
    private String brand;
    private String model;
    private double price;

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{brand='" + brand + "', model='" + model + "', price=" + price + "}";
    }
    @Override
    public int hashCode() {
        return 57;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Phone) {
                System.out.println("Comparing!!!!!!");
                Phone phone = this;
                Phone phone1 = (Phone) obj;
                if (phone.brand.equals(phone1.brand) && phone.model.equals(phone1.model)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
