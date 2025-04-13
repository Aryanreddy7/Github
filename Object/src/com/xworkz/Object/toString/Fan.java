package com.xworkz.Object.toString;

public class Fan {
    private String type;
    private int speedLevels;
    private boolean remoteControl;

    public Fan(String type, int speedLevels, boolean remoteControl) {
        this.type = type;
        this.speedLevels = speedLevels;
        this.remoteControl = remoteControl;
    }

    @Override
    public String toString() {
        return "Fan{type='" + type + "', speedLevels=" + speedLevels + ", remoteControl=" + remoteControl + "}";
    }
    @Override
    public int hashCode() {
        return 28;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Fan) {
                System.out.println("Comparing!!!!!!");
                Fan fan = this;
                Fan fan1 = (Fan) obj;
                if(fan.type.equals(fan1.type)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
