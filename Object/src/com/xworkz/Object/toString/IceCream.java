package com.xworkz.Object.toString;

public class IceCream {
    private String flavor;
    private String size;
    private double price;

    public IceCream(String flavor, String size, double price) {
        this.flavor = flavor;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "IceCream{flavor='" + flavor + "', size='" + size + "', price=" + price + "}";
    }
    @Override
    public int hashCode() {
        return 40;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof IceCream) {
                System.out.println("Comparing!!!!!!");
                IceCream iceCream = this;
                IceCream iceCream1 = (IceCream) obj;
                if (iceCream.flavor.equals(iceCream1.flavor) && iceCream.price == iceCream1.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
