package com.xworkz.Object.toString;

public class Wardrobe {
    private int doors;
    private String color;
    private boolean sliding;

    public Wardrobe(int doors, String color, boolean sliding) {
        this.doors = doors;
        this.color = color;
        this.sliding = sliding;
    }

    @Override
    public String toString() {
        return "Wardrobe{doors=" + doors + ", color='" + color + "', sliding=" + sliding + "}";
    }
    @Override
    public int hashCode() {
        return 96;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Wardrobe) {
                System.out.println("Comparing!!!!!!");
                Wardrobe wardrobe = this;
                Wardrobe wardrobe1 = (Wardrobe) obj;
                if (wardrobe.color.equals(wardrobe1.color) && wardrobe.sliding == wardrobe1.sliding && wardrobe.doors == wardrobe1.doors ) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
