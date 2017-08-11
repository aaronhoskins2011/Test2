package com.example.aaron.test2;

import android.os.Bundle;

/**
 * Created by aaron on 8/11/17.
 */

public class Cars {
    String model;
    String type;
    int year;

    public Cars (String model, String type, int year) {
        this.model = model;
        this.type = type;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
