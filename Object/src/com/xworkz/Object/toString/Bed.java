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
    @Override
    public int hashCode() {
        return 06;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Bed) {
                System.out.println("Comparing!!!!!!");
                Bed bed = this;
                Bed bed1 = (Bed) obj;
                if(bed.size.equals(bed1.size)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
