package com.xworkz.Inheritance.DressBrand;

public class FashionBrand  {
    public void displayRefinedStyle(Armani armani) {
        armani.cut();
        armani.remove();
        armani.cut();
        armani.stitch();
        armani.wear();
        if(armani instanceof DressBrand){
            DressBrand dressBrand=(DressBrand)armani;
            System.out.println("Armani is DressBrand");

        }
    }

}
