package com.Epicode.demoSpring;

public class Drink extends ElementiMenu {
    protected String name;

    public Drink( String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public Drink() {
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name +
                " calories:" + calories +
                ", price:" + price ;
    }
}
