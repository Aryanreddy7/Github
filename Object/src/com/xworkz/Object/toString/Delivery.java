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
}
