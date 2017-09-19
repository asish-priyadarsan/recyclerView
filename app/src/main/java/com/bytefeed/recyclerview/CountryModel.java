package com.bytefeed.recyclerview;

/**
 * Created by DELL on 16-09-2017.
 */

public class CountryModel {
    String name;
    int image;

    public CountryModel() {
    }

    public CountryModel(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
