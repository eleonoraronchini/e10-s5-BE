package com.Epicode.demoSpring;

public class Pizza extends ElementiMenu{
    protected String name;
    protected Ingredients tomato;
    protected Ingredients cheese;


    public Pizza(String name, Ingredients tomato, Ingredients cheese, int calories, double price) {
        this.name = name;
        this.tomato = tomato;
        this.cheese = cheese;
        this.calories = calories;
        this.price = price;
    }

    public Pizza() {
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

    public Ingredients getTomato() {
        return tomato;
    }

    public void setTomato(Ingredients tomato) {
        this.tomato = tomato;
    }

    public Ingredients getCheese() {
        return cheese;
    }

    public void setCheese(Ingredients cheese) {
        this.cheese = cheese;
    }

    @Override
    public String toString() {
        return
                name +
                " (Ingredients:" + tomato + "," +
                  cheese + ")" +
                ", calories:" + calories +
                ", price:" + price ;
    }
}
