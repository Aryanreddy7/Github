package com.xworkz.Object.toString;

public class Chair {
    private String type;
    private String material;
    private boolean wheels;

    public Chair(String type, String material, boolean wheels) {
        this.type = type;
        this.material = material;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Chair{type='" + type + "', material='" + material + "', wheels=" + wheels + "}";
    }
    @Override
    public int hashCode() {
        return 13;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Chair) {
                System.out.println("Comparing!!!!!!");
                Chair chair = this;
                Chair chair1 = (Chair) obj;
                if(chair.material.equals(chair1.material)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
