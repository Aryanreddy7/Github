package com.xworkz.EnumProperties;

public enum Tv {
        SAMSUNG("LED",10),SONY("Oled",2000),LG("LCD");

        private String screenType;
        private int price;

        private Tv(String screenType,int price){
            this.screenType=screenType;
            this.price=price;
        }
    private Tv(String screenType) {
        this.screenType = screenType;
        this.price = price;
    }

}
