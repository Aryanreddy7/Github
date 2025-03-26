package com.xworkz.ClassesAsLocalVariables;

public class IdCardRunner {
    public static void main(String[] args) {
        IdCard idCard = new IdCard();
        School school = new School();
        idCard.setMaterial("Plastic");
        idCard.setDesignedBy("Suresh");
        idCard.setWeight(16.88);
        school.teach(idCard);

    }

}

