package com.xworkz.Object.toString;

public class Delivery {
    private String item;
    private String address;
    private boolean delivered;

    public Delivery(String item, String address, boolean delivered) {
        this.item = item;
        this.address = address;
        this.delivered = delivered;
    }

    @Override
    public String toString() {
        return "Delivery{item='" + item + "', address='" + address + "', delivered=" + delivered + "}";
    }
    @Override
    public int hashCode() {
        return 22;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Delivery) {
                System.out.println("Comparing!!!!!!");
                Delivery delivery = this;
                Delivery delivery1 = (Delivery) obj;
                if(delivery.address.equals(delivery1.address)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
