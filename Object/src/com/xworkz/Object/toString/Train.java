package com.xworkz.Object.toString;

public class Train {
    private String name;
    private int coaches;
    private String route;

    public Train(String name, int coaches, String route) {
        this.name = name;
        this.coaches = coaches;
        this.route = route;
    }

    @Override
    public String toString() {
        return "Train{name='" + name + "', coaches=" + coaches + ", route='" + route + "'}";
    }
    @Override
    public int hashCode() {
        return 77;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Train) {
                System.out.println("Comparing!!!!!!");
                Train train = this;
                Train train1 = (Train) obj;
                if (train.name.equals(train1.name) && train.coaches == train1.coaches && (train.route.equals(train1.route))) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
