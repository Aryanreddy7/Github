package com.xworkz.Inheritance.DressBrand;

public class RunwayRoyalty {
    public void debutCoutureCollection(Dior dior){
        dior.cut();
        dior.remove();
        dior.cut();
        dior.stitch();
        dior.wear();
        if(dior instanceof DressBrand){
            DressBrand dressBrand=(DressBrand)dior;
            System.out.println("Dior is DressBrand");

        }
    }
}
