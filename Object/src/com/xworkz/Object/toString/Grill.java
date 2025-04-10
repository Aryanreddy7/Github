package com.xworkz.Object.toString;

public class Grill {
    private String type;
    private int burners;
    private boolean gas;

    public Grill(String type, int burners, boolean gas) {
        this.type = type;
        this.burners = burners;
        this.gas = gas;
    }

    @Override
    public String toString() {
        return "Grill{type='" + type + "', burners=" + burners + ", gas=" + gas + "}";
    }
}
