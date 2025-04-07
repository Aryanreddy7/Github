package com.xworkz.Inheritance.DressBrand;

public class UrbanRebel {
    public void launchStreetwearDrop(Balenciaga balenciaga){
        balenciaga.cut();
        balenciaga.remove();
        balenciaga.stitch();
        balenciaga.tear();
        balenciaga.wear();

        if(balenciaga instanceof DressBrand){
            DressBrand dressBrand=(DressBrand)balenciaga;
            System.out.println("Balenciaga is DressBrand");
        }
    }
}
