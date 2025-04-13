package com.xworkz.Object.toString;

public class Printer {
        private String brand;
        private String type;
        private boolean wireless;

        public Printer(String brand, String type, boolean wireless) {
            this.brand = brand;
            this.type = type;
            this.wireless = wireless;
        }

        @Override
        public String toString() {
            return "Printer{brand='" + brand + "', type='" + type + "', wireless=" + wireless + "}";
        }
    @Override
    public int hashCode() {
        return 61;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Printer) {
                System.out.println("Comparing!!!!!!");
                Printer printer = this;
                Printer printer1 = (Printer) obj;
                if (printer.brand.equals(printer1.brand) && printer.wireless==printer1.wireless && printer.type.equals(printer1.type)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
