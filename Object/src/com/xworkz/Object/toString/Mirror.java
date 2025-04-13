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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Mirror) {
                System.out.println("Comparing!!!!!!");
                Mirror mirror = this;
                Mirror mirror1 = (Mirror) obj;
                if (mirror.shape.equals(mirror1.shape) && mirror.frameMaterial.equals(mirror1.frameMaterial)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
