package com.xworkz.ClassesAsLocalVariables;

public class School {
    public void teach(IdCard idCard) {
        if (idCard != null) {
            System.out.println(idCard.getMaterial());
            System.out.println(idCard.getWeight());
            System.out.println(idCard.getDesignedBy());
//        System.out.println(idCard.getColor());
        }
    }
}
