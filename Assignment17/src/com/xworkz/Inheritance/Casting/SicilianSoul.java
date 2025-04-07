package com.xworkz.Inheritance.DressBrand;

public class SicilianSoul {
    public void embraceHeritageDesign(DolceAndGabbana dolceAndGabbana){
        dolceAndGabbana.cut();
        dolceAndGabbana.remove();
        dolceAndGabbana.stitch();
        dolceAndGabbana.tear();
        dolceAndGabbana.wear();

        if(dolceAndGabbana instanceof DressBrand){
            DressBrand dressBrand=(DressBrand)dolceAndGabbana;
            System.out.println("DolceAndGabbana is DressBrand");
        }
    }
}
