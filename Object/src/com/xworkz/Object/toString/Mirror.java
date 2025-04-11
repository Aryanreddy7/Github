package com.xworkz.Object.toString;

public class Mirror {
    private String shape;
    private String frameMaterial;
    private boolean wallMounted;

    public Mirror(String shape, String frameMaterial, boolean wallMounted) {
        this.shape = shape;
        this.frameMaterial = frameMaterial;
        this.wallMounted = wallMounted;
    }

    @Override
    public String toString() {
        return "Mirror{shape='" + shape + "', frameMaterial='" + frameMaterial + "', wallMounted=" + wallMounted + "}";
    }
    @Override
    public int hashCode() {
        return 47;
    }
}
