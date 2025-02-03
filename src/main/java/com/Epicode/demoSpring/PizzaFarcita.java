package com.Epicode.demoSpring;

public class PizzaFarcita extends Pizza {
    private Ingredients extra;
    private Ingredients extra2;

    public PizzaFarcita(String name, Ingredients tomato, Ingredients cheese, Ingredients extra, int calories, double price) {
        super(name, tomato, cheese, calories, price);
        this.extra = extra;

    }
    public PizzaFarcita(String name, Ingredients tomato, Ingredients cheese, Ingredients extra, Ingredients extra2,int calories, double price) {
        super(name, tomato, cheese, calories, price);
        this.extra = extra;
        this.extra2 = extra2;
    }

    public PizzaFarcita() {

    }

    public Ingredients getExtra() {
        return extra;
    }

    public void setExtra(Ingredients extra) {
        this.extra = extra;
    }

    public Ingredients getExtra2() {
        return extra2;
    }

    public void setExtra2(Ingredients extra2) {
        this.extra2 = extra2;
    }

    @Override
    public String toString() {
        return
                name +
                " (Ingredients:" + tomato + "," +
                cheese + "," + extra  + (extra2 != null ? ", " + extra2 : "") + ")" +
                    ", calories:" + calories +
                    ", price:" + price ;
        }

    }

