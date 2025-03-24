package com.xworkz.AccessModifier;

import com.workz.AccessSpecifier.Manufacturer;

public class DoorRunner {
    public static void main(String[] args) {
        Producer producer=new Producer();
        producer.display();

        Manufacturer manufacturer=new Manufacturer();
        manufacturer.display();
    }
}
