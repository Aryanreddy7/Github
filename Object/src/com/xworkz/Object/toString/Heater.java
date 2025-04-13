package com.xworkz.Object.toString;

public class Heater {
    private String type;
    private int power;
    private boolean portable;

    public Heater(String type, int power, boolean portable) {
        this.type = type;
        this.power = power;
        this.portable = portable;
    }

    @Override
    public String toString() {
        return "Heater{type='" + type + "', power=" + power + ", portable=" + portable + "}";
    }
    @Override
    public int hashCode() {
        return 38;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Heater) {
                System.out.println("Comparing!!!!!!");
                Heater heater = this;
                Heater heater1 = (Heater) obj;
                if (heater.type.equals(heater1.type) && heater.power == heater1.power) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
