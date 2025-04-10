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
}
