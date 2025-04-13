package com.xworkz.Object.toString;

public class Tree {
    private String species;
    private double height;
    private int age;

    public Tree(String species, double height, int age) {
        this.species = species;
        this.height = height;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tree{species='" + species + "', height=" + height + ", age=" + age + "}";
    }
    @Override
    public int hashCode() {
        return 78;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Tree) {
                System.out.println("Comparing!!!!!!");
                Tree tree = this;
                Tree tree1 = (Tree) obj;
                if (tree.species.equals(tree1.species) && tree.height == tree1.height && tree.age == tree1.age) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
