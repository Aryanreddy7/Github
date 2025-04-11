package com.xworkz.Object.toString;

public class Painter {
    private String name;
    private String style;
    private int paintingsCount;

    public Painter(String name, String style, int paintingsCount) {
        this.name = name;
        this.style = style;
        this.paintingsCount = paintingsCount;
    }

    @Override
    public String toString() {
        return "Painter{name='" + name + "', style='" + style + "', paintingsCount=" + paintingsCount + "}";
    }
    @Override
    public int hashCode() {
        return 54;
    }
}
