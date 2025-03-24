package com.workz.AccessSpecifier;

public class School {
    public String name;
    private  int phoneno;
    String USN;

    public void teach(){
        this.phoneno=1234;
        System.out.println("Running teach with his phno:"+phoneno);
    }
    private void play(){
        System.out.println("Running Play in School");
    }
    void sleep(){
        play();
        System.out.println("Running Sleep in School");
    }

}
