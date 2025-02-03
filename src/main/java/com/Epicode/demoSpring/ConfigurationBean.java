package com.Epicode.demoSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBean {
@Bean
    public Pizza pizza (){
        return new Pizza("PIZZA MARGHERITA",Ingredients.tomato,Ingredients.cheese,1109,4.99);
    }
    @Bean
    public PizzaFarcita pizza1(){
    return new PizzaFarcita("PIZZA WITH SALAMI",Ingredients.tomato,Ingredients.cheese,Ingredients.salami,1340,6.50);
    }

    @Bean
    public PizzaFarcita pizza2 (){
    return new PizzaFarcita("HAWAIIAN PIZZA",Ingredients.tomato,Ingredients.cheese,Ingredients.ham,Ingredients.pineapple,1350,8.90);

    }
    @Bean
    public PizzaFarcita pizza3 (){
    return new PizzaFarcita("PIZZA ONION AND TUNA",Ingredients.tomato,Ingredients.cheese,Ingredients.onions,Ingredients.tuna,1400,9.00);
    }

  @Bean
    public Drink drink1 (){
        return new Drink("LEMONADE(O.33L)",128,1.29);
    }
    @Bean
    public Drink drink2 (){
        return new Drink("WATER(O.5L)",0,1.29);
    }
    @Bean
    public Drink drink3 (){
        return new Drink("WINE(O.75L),13%",607,7.49);
    }

    @Bean
    public Topping topping1 (){
        return new Topping(Ingredients.tomato,20,0.50);
    }
    @Bean
    public Topping topping2 (){
    return new Topping(Ingredients.cheese,92,0.69);
    }
    @Bean
    public Topping topping3 (){
    return new Topping(Ingredients.ham,35,0.99);
    }
    @Bean
    public Topping topping4 (){
        return new Topping(Ingredients.onions,22,0.69);
    }
    @Bean
    public Topping topping5 (){
        return new Topping(Ingredients.pineapple,24,0.79);
    }

    @Bean
    public Topping topping6 (){
    return new Topping(Ingredients.salami,86,0.99);
    }

    @Bean
    public Topping topping7 (){
    return new Topping(Ingredients.tuna,79,1.10);
    }

    @Bean
    public PizzaXL pizzaXL1 (){
    return new PizzaXL("PIZZA MARGHERITA XL",Ingredients.tomato,Ingredients.cheese,1709,9.99);
    }

    @Bean
    public PizzaFarcitaXL pizzaFarcitaXL1 (){
    return new PizzaFarcitaXL("PIZZA WITH SALAMI XL",Ingredients.tomato,Ingredients.cheese,Ingredients.salami,2040,13.50);
    }

    @Bean
    public PizzaFarcitaXL pizzaFarcitaXL2 (){
    return new PizzaFarcitaXL("HAWAIIAN PIZZA XL",Ingredients.tomato,Ingredients.cheese,Ingredients.ham,Ingredients.pineapple,1950,11.90);
    }

    @Bean
    public PizzaFarcitaXL pizzaFarcitaXL3 (){
    return new PizzaFarcitaXL("PIZZA ONION AND TUNA XL",Ingredients.tomato,Ingredients.cheese,Ingredients.onions,Ingredients.tuna,2060,14.00);
    }

}
