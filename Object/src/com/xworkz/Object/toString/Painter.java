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
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Painter) {
                System.out.println("Comparing!!!!!!");
                Painter painter = this;
                Painter painter1 = (Painter) obj;
                if (painter.name.equals(painter1.name) && painter.style.equals(painter1.style)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
