package com.Epicode.demoSpring;

import lombok.Getter;
import lombok.Setter;


public class PizzaFarcitaXL extends PizzaFarcita {
    public PizzaFarcitaXL(String name, Ingredients tomato, Ingredients cheese, Ingredients extra, int calories, double price) {
        super(name, tomato, cheese, extra, calories, price);
    }

    public PizzaFarcitaXL(String name, Ingredients tomato, Ingredients cheese, Ingredients extra, Ingredients extra2, int calories, double price) {
        super(name, tomato, cheese, extra, extra2, calories, price);
    }

    public PizzaFarcitaXL() {
    }

    @Override
    public String toString() {
        return
                name +
                        " (Ingredients:" + tomato + "," +
                        cheese + "," + super.getExtra() + (super.getExtra2()  != null ? ", " + super.getExtra2() : "") + ")" +
                        ", calories:" + calories +
                        ", price:" + price ;
    }
}
