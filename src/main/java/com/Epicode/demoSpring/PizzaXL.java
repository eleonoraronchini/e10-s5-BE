package com.Epicode.demoSpring;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PizzaXL extends Pizza{

    public PizzaXL(String name, Ingredients tomato, Ingredients cheese, int calories, double price) {
        super(name, tomato, cheese, calories, price);
    }
}
