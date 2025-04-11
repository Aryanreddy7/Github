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
}
