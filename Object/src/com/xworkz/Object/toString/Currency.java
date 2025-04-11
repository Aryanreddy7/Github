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
}
