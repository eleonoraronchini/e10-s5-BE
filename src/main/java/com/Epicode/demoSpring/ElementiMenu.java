package com.Epicode.demoSpring;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class ElementiMenu {
    protected int calories;
    protected double price;
}
