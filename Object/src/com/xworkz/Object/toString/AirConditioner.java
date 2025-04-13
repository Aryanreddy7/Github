package com.xworkz.Object.toString;

public class AirConditioner {
        private String brand;
        private int tonnage;
        private String type;

        public AirConditioner(String brand, int tonnage, String type) {
            this.brand = brand;
            this.tonnage = tonnage;
            this.type = type;
        }

        @Override
        public int hashCode(){
            return 01;
        }
        @Override
        public String toString() {
            return "AirConditioner{brand='" + brand + "', tonnage=" + tonnage + ", type='" + type + "'}";
        }

    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof AirConditioner)
            {
                System.out.println("Comparing!!!!!!");
                AirConditioner airConditioner=this;
                AirConditioner airConditioner2=(AirConditioner)obj;
                if(airConditioner.brand.equals(airConditioner2.brand) && airConditioner.tonnage==airConditioner2.tonnage && (airConditioner.type.equals(airConditioner2.type)))
                {
                    System.out.println("both  are same");
                    return true;
                }
            }
        }
        return false;
    }


}
