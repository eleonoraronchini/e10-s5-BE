package com.Epicode.demoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

import static com.Epicode.demoSpring.ConfigurationBean.menuList;

@SpringBootApplication
public class DemoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringApplication.class, args);

       MenuConfiguration();
	   System.out.println(menuList);
	   Ordine();
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
	public static void Ordine (){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationBean.class);
		Ordine o = (Ordine) applicationContext.getBean("ordine1");
		System.out.println(o);
	}

}
