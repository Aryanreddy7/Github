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
}
