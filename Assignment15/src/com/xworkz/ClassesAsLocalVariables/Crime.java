package com.xworkz.ClassesAsLocalVariables;

public class Crime {
    public void GoToJail(Jail jail) {
//        jail.setJailerName("aryan");
//        jail.setLocation("udaipur");
//        jail.setName("Surya");
//        jail.setTotalcells(100);
        if (jail != null) {
            System.out.println(jail.getJailerName());
            System.out.println(jail.getLocation());
            System.out.println(jail.getName());
            System.out.println(jail.getTotalcells());

        }
    }
}
//    public void injail() {
//        Jail jail=new Jail();
//        jail.setJailerName("aryan");
//        GoToJail(jail);
//
//    }
//}
