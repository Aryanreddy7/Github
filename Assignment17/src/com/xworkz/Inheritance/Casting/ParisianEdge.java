package com.xworkz.Inheritance.DressBrand;

public class ParisianEdge {
    public void unveilModernChic(Givenchy givenchy){
        givenchy.cut();
        givenchy.remove();
        givenchy.cut();
        givenchy.stitch();
        givenchy.wear();
        if(givenchy instanceof DressBrand){
            DressBrand dressBrand=(DressBrand)givenchy;
            System.out.println("Dior is DressBrand");

        }
    }
}