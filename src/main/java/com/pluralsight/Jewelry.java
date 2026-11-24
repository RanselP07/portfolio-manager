package com.pluralsight;

public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double karat) {
        super(name);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return karat * 10000;
    }
}
