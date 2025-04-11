package com.xworkz.Object.Runner;

import com.xworkz.Object.toString.Tshirt;

public class TshirtRunner {
    public static void main(String[] args) {
        Tshirt tshirt1=new Tshirt();
        tshirt1.setBrand("Puma");
        tshirt1.setColor("Yellow");
        tshirt1.setSize(10);

        Tshirt tshirt2=new Tshirt();
        tshirt2.setBrand("Pu");
        tshirt2.setColor("Yellow");
        tshirt2.setSize(10);

        System.out.println("Checking location"+(tshirt1==tshirt2));
        boolean same=tshirt1.equals(tshirt1);
        System.out.println("same as 2"+same);


    }
}
