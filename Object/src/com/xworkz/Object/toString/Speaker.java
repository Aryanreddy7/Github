package com.xworkz.Object.toString;

public class Speaker {
        private String brand;
        private int power;
        private boolean bluetooth;

        public Speaker(String brand, int power, boolean bluetooth) {
            this.brand = brand;
            this.power = power;
            this.bluetooth = bluetooth;
        }

        @Override
        public String toString() {
            return "Speaker{brand='" + brand + "', power=" + power + ", bluetooth=" + bluetooth + "}";
        }
    @Override
    public int hashCode() {
        return 68;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Speaker) {
                System.out.println("Comparing!!!!!!");
                Speaker speaker = this;
                Speaker speaker1 = (Speaker) obj;
                if (speaker.brand.equals(speaker1.brand) && speaker.power == speaker1.power && speaker.bluetooth==speaker1.bluetooth) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
