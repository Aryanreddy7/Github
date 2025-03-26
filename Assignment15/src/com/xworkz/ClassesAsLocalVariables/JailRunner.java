package com.xworkz.ClassesAsLocalVariables;

public class JailRunner {
    public static void main(String[] args) {
        Jail jail=new Jail();
        Crime crime=new Crime();
        jail.setJailerName("aryan");
        jail.setLocation("udaipur");
        jail.setName("Surya");
        jail.setTotalcells(100);
       crime.GoToJail(jail);


    }
}
