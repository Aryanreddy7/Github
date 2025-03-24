package com.workz.AccessSpecifier;

public class Door {
    public int weight;
    private int NoOfLocks;
    String TypeofWood;
    public void Knock(){
        NoOfLocks=10;
        System.out.println("Running Knock "+NoOfLocks);
    }
    private void open(){
        System.out.println("Running open");
    }
    void close(){
        open();
        System.out.println("Running Close:Type="+TypeofWood);
    }
}
