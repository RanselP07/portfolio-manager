package com.pluralsight;

import java.util.ArrayList;

public abstract class FixedAsset implements Valuable{
    private String name;


    public FixedAsset(String name) {
        this.name = name;
    }

    public abstract double getValue();
}
