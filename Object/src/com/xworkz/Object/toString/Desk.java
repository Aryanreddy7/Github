package com.xworkz.Object.toString;

public class Desk {
    private String material;
    private String color;
    private int drawers;

    public Desk(String material, String color, int drawers) {
        this.material = material;
        this.color = color;
        this.drawers = drawers;
    }

    @Override
    public String toString() {
        return "Desk{material='" + material + "', color='" + color + "', drawers=" + drawers + "}";
    }
    @Override
    public int hashCode() {
        return 23;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Desk) {
                System.out.println("Comparing!!!!!!");
                Desk desk = this;
                Desk desk1 = (Desk) obj;
                if(desk.material.equals(desk1.material)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
