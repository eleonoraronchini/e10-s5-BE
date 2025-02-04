package com.Epicode.demoSpring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigurationBean {

   public static List<ElementiMenu> menuList = new ArrayList<ElementiMenu>();
   public static List<ElementiMenu> order1 = new ArrayList<ElementiMenu>();
   public static List<ElementiMenu> order2 = new ArrayList<ElementiMenu>();
   public static List<ElementiMenu> order3 = new ArrayList<ElementiMenu>();


@Bean
    public Pizza pizza (){
        Pizza p = new Pizza("PIZZA MARGHERITA",Ingredients.tomato,Ingredients.cheese,1109,4.99);
        menuList.add(p);
        order1.add(p);
        return p;
}
    @Bean
    public PizzaFarcita pizza1(){
    PizzaFarcita p = new PizzaFarcita("PIZZA WITH SALAMI",Ingredients.tomato,Ingredients.cheese,Ingredients.salami,1340,6.50);
        menuList.add(p);
        order2.add(p);
        order3.add(p);
        return p;
    }

    @Bean
    public PizzaFarcita pizza2 (){
    PizzaFarcita p = new PizzaFarcita("HAWAIIAN PIZZA",Ingredients.tomato,Ingredients.cheese,Ingredients.ham,Ingredients.pineapple,1350,8.90);
        menuList.add(p);
        order1.add(p);
        order3.add(p);
        return p;
    }
    @Bean
    public PizzaFarcita pizza3 (){
    PizzaFarcita p =  new PizzaFarcita("PIZZA ONION AND TUNA",Ingredients.tomato,Ingredients.cheese,Ingredients.onions,Ingredients.tuna,1400,9.00);
        menuList.add(p);
        order3.add(p);
        order3.add(p);
        return p;
     }

  @Bean
    public Drink drink1 (){
        Drink d =  new Drink("LEMONADE(O.33L)",128,1.29);
        menuList.add(d);
        order1.add(d);
        order3.add(d);
        return d;
    }
    @Bean
    public Drink drink2 (){
        Drink d = new Drink("WATER(O.5L)",0,1.29);
        menuList.add(d);
        order1.add(d);
        order3.add(d);
        return d;
}
    @Bean
    public Drink drink3 (){
        Drink d= new Drink("WINE(O.75L),13%",607,7.49);
        menuList.add(d);
        order2.add(d);
        order3.add(d);
        order3.add(d);
        return d;
}

    @Bean
    public Topping topping1 (){
        Topping t =  new Topping(Ingredients.tomato,20,0.50);
        menuList.add(t);
        return t;
      }
    @Bean
    public Topping topping2 (){
    Topping t =  new Topping(Ingredients.cheese,92,0.69);
        menuList.add(t);
        return t;
    }
    @Bean
    public Topping topping3 (){
    Topping t = new Topping(Ingredients.ham,35,0.99);
        menuList.add(t);
        return t;
    }
    @Bean
    public Topping topping4 (){
        Topping t = new Topping(Ingredients.onions,22,0.69);
        menuList.add(t);
        return t;
    }
    @Bean
    public Topping topping5 (){
        Topping t = new Topping(Ingredients.pineapple,24,0.79);
        menuList.add(t);
        return t;
    }

    @Bean
    public Topping topping6 (){
    Topping t = new Topping(Ingredients.salami,86,0.99);
        menuList.add(t);
        return t;
    }

    @Bean
    public Topping topping7 (){
    Topping t = new Topping(Ingredients.tuna,79,1.10);
        menuList.add(t);
        return t;
    }

    @Bean
    public PizzaXL pizzaXL1 (){
    PizzaXL p = new PizzaXL("PIZZA MARGHERITA XL",Ingredients.tomato,Ingredients.cheese,1709,9.99);
        menuList.add(p);
        return p;
}

    @Bean
    public PizzaFarcitaXL pizzaFarcitaXL1 (){
    PizzaFarcitaXL p = new PizzaFarcitaXL("PIZZA WITH SALAMI XL",Ingredients.tomato,Ingredients.cheese,Ingredients.salami,2040,13.50);
        menuList.add(p);
        return p;
    }

    @Bean
    public PizzaFarcitaXL pizzaFarcitaXL2 (){
    PizzaFarcitaXL p =  new PizzaFarcitaXL("HAWAIIAN PIZZA XL",Ingredients.tomato,Ingredients.cheese,Ingredients.ham,Ingredients.pineapple,1950,11.90);
        menuList.add(p);
        return p;
}

    @Bean
    public PizzaFarcitaXL pizzaFarcitaXL3 (){
    PizzaFarcitaXL p = new PizzaFarcitaXL("PIZZA ONION AND TUNA XL",Ingredients.tomato,Ingredients.cheese,Ingredients.onions,Ingredients.tuna,2060,14.00);
        menuList.add(p);
        return p;
    }
    @Value("${Ordine.admin.coperto}")
    private Double coperto;
  @Bean ("ordine1")
    public Ordine ordine1 (){
    Ordine o = new Ordine(1,StatoOrdine.pronto,2, LocalDate.of(2025,3,2),order1,coperto);
    return o;
    }

    @Bean ("ordine2")
    public Ordine ordine2 (){
        Ordine o = new Ordine(2,StatoOrdine.in_corso,1, LocalDate.of(2025,3,2),order2,coperto);
        return o;
    }

    @Bean ("ordine3")
    public Ordine ordine3 (){
        Ordine o = new Ordine(3,StatoOrdine.servito,4, LocalDate.of(2025,3,2),order3,coperto);
        return o;
    }
    @Bean ("tavolo1")
    public Tavolo tavolo1 (){
        Tavolo t = new Tavolo(12,2,StatoTavolo.occupato);
        return t;
    }

    @Bean ("tavolo2")
    public Tavolo tavolo2 (){
        Tavolo t = new Tavolo(45,6,StatoTavolo.libero);
        return t;
    }

    @Bean ("tavolo3")
    public Tavolo tavolo3 (){
        Tavolo t = new Tavolo(2,4,StatoTavolo.occupato);
        return t;
    }
}
