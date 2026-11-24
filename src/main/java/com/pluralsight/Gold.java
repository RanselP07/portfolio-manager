package com.pluralsight;

public class Gold extends FixedAsset {
    private double weight;

    public Gold(double weight) {
        super("Gold");
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return this.weight * 3500;
    }
}
