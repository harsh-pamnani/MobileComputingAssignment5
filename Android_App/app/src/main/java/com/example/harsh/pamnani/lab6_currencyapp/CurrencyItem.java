package com.example.harsh.pamnani.lab6_currencyapp;

public class CurrencyItem {
    private String base;
    private double value;

    public CurrencyItem(String base, double value) {
        this.base = base;
        this.value = value;
    }

    public String getBase() {
        return base;
    }

    public double getValue() {
        return value;
    }
}