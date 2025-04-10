package com.xworkz.Object.toString;

public class Bed {
    private String size;
    private String frameMaterial;
    private boolean storage;

    public Bed(String size, String frameMaterial, boolean storage) {
        this.size = size;
        this.frameMaterial = frameMaterial;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Bed{size='" + size + "', frameMaterial='" + frameMaterial + "', storage=" + storage + "}";
    }
}
