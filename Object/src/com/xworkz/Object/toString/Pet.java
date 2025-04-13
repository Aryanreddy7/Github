package com.xworkz.Object.toString;

public class Pet {
    private String name;
    private String species;
    private int age;

    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{name='" + name + "', species='" + species + "', age=" + age + "}";
    }
    @Override
    public int hashCode() {
        return 56;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Pet) {
                System.out.println("Comparing!!!!!!");
                Pet pet = this;
                Pet pet1 = (Pet) obj;
                if (pet.name.equals(pet1.name) && pet.species.equals(pet1.species)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
