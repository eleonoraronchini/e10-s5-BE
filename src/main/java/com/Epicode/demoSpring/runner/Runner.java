package com.Epicode.demoSpring.runner;

import com.Epicode.demoSpring.*;
import com.Epicode.demoSpring.service.OrdineService;
import com.Epicode.demoSpring.service.TavoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
   private OrdineService ordineService;
    @Autowired
    private TavoloService tavoloService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("------MENU------");
        MenuConfiguration();


        Tavolo t1 = tavoloService.createTavolo1();
        System.out.println(t1);
        Tavolo t2 = tavoloService.createTavolo2();
        System.out.println(t2);
        Tavolo t3 = tavoloService.createTavolo3();
        System.out.println(t3);
        System.out.println("");

        Ordine o1 = ordineService.createOrdine1();
        System.out.println(o1);
        Ordine o2 = ordineService.createOrdine2();
        System.out.println(o2);
        Ordine o3 = ordineService.createOrdine3();
        System.out.println(o3);
        System.out.println("");


        o1.TotaleOrdine();
        o2.TotaleOrdine();
        o3.TotaleOrdine();





    }
    public static void PizzaConfiguration (){
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationBean.class);
        Pizza p1 = (Pizza) appContext.getBean("pizza");
        System.out.println("PIZZAS:");
        System.out.println(p1);
        PizzaFarcita p2 = (PizzaFarcita) appContext.getBean("pizza1");
        System.out.println(p2);
        PizzaFarcita p3 = (PizzaFarcita) appContext.getBean("pizza2");
        System.out.println(p3);
        PizzaFarcita p4 = (PizzaFarcita) appContext.getBean("pizza3");
        System.out.println(p4);
        System.out.println("");

        appContext.close();
    }

    public static void ToppingConfiguration (){
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationBean.class);
        Topping t1 = (Topping) appContext.getBean("topping1");
        System.out.println("TOPPINGS:");
        System.out.println(t1);
        Topping t2 = (Topping) appContext.getBean("topping2");
        System.out.println(t2);
        Topping t3 = (Topping) appContext.getBean("topping3");
        System.out.println(t3);
        Topping t4 = (Topping) appContext.getBean("topping4");
        System.out.println(t4);
        Topping t5 = (Topping) appContext.getBean("topping5");
        System.out.println(t5);
        Topping t6 = (Topping) appContext.getBean("topping6");
        System.out.println(t6);
        Topping t7 = (Topping) appContext.getBean("topping7");
        System.out.println(t7);
        System.out.println("");

        appContext.close();

    }

    public static void DrinkConfiguration (){
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationBean.class);
        System.out.println("DRINKS:");
        Drink d1 = (Drink) appContext.getBean("drink1");
        System.out.println(d1);
        Drink d2 = (Drink) appContext.getBean("drink2");
        System.out.println(d2);
        Drink d3 = (Drink) appContext.getBean("drink3");
        System.out.println(d3);
        System.out.println("");

        appContext.close();
    }

    public static void PizzaXLConfiguration (){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationBean.class);
        System.out.println("PIZZAS FORMATO XL:");
        PizzaXL p1 = (PizzaXL) applicationContext.getBean("pizzaXL1");
        System.out.println(p1);
        PizzaFarcitaXL p2 = (PizzaFarcitaXL) applicationContext.getBean("pizzaFarcitaXL1");
        System.out.println(p2);
        PizzaFarcitaXL p3 = (PizzaFarcitaXL) applicationContext.getBean("pizzaFarcitaXL2");
        System.out.println(p3);
        PizzaFarcitaXL p4 = (PizzaFarcitaXL) applicationContext.getBean("pizzaFarcitaXL3");
        System.out.println(p4);
        System.out.println("");

        applicationContext.close();
    }
    public static void MenuConfiguration(){
        PizzaConfiguration();
        PizzaXLConfiguration();
        ToppingConfiguration();
        DrinkConfiguration();
    }
    public static void OrdineConfiguration (){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationBean.class);
        Ordine o = (Ordine) applicationContext.getBean("ordine1");
        System.out.println(o);
        Ordine o2 = (Ordine) applicationContext.getBean("ordine2");
        System.out.println(o2);
        Ordine o3 = (Ordine) applicationContext.getBean("ordine3");
        System.out.println(o3);
        System.out.println("");
    }
}
