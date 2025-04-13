package com.xworkz.Object.toString;

public class Currency {
    private String name;
    private String symbol;
    private double exchangeRate;

    public Currency(String name, String symbol, double exchangeRate) {
        this.name = name;
        this.symbol = symbol;
        this.exchangeRate = exchangeRate;
    }

    @Override
    public String toString() {
        return "Currency{name='" + name + "', symbol='" + symbol + "', exchangeRate=" + exchangeRate + "}";
    }
    @Override
    public int hashCode() {
        return 21;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Currency) {
                System.out.println("Comparing!!!!!!");
                Currency currency = this;
                Currency currency1 = (Currency) obj;
                if(currency.name.equals(currency1.name)) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
