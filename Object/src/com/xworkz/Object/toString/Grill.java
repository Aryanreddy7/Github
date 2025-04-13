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
    @Override
    public int hashCode() {
        return 35;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Grill) {
                System.out.println("Comparing!!!!!!");
                Grill grill = this;
                Grill grill1 = (Grill) obj;
                if (grill.type.equals(grill1.type) && grill.burners == grill1.burners) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
