package com.Epicode.demoSpring;

public class Topping extends ElementiMenu {
    private Ingredients ingredient;



    public Topping(Ingredients ingredient, int calories, double price) {
        this.ingredient = ingredient;
        this.calories = calories;
        this.price = price;
    }

    public Topping() {
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

    public Ingredients getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredients ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public String toString() {
        return
                 ingredient +
                ", calories:" + calories +
                ", price:" + price ;
    }
}
