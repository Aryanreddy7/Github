package com.xworkz.Object.toString;

public class Console {
    private String name;
    private int storage;
    private boolean portable;

    public Console(String name, int storage, boolean portable) {
        this.name = name;
        this.storage = storage;
        this.portable = portable;
    }

    @Override
    public String toString() {
        return "Console{name='" + name + "', storage=" + storage + ", portable=" + portable + "}";
    }
    @Override
    public int hashCode() {
        return 20;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Console) {
                System.out.println("Comparing!!!!!!");
                Console console = this;
                Console console1 = (Console) obj;
                if(console.name.equals(console1.name)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
