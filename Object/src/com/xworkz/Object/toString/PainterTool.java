package com.xworkz.Object.toString;

public class PainterTool {
    private String name;
    private String material;
    private double weight;

    public PainterTool(String name, String material, double weight) {
        this.name = name;
        this.material = material;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "PainterTool{name='" + name + "', material='" + material + "', weight=" + weight + "}";
    }
    @Override
    public int hashCode() {
        return 55;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof PainterTool) {
                System.out.println("Comparing!!!!!!");
                PainterTool painterTool = this;
                PainterTool painterTool1 = (PainterTool) obj;
                if (painterTool.name.equals(painterTool1.name) && painterTool.material.equals(painterTool1.material)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}


