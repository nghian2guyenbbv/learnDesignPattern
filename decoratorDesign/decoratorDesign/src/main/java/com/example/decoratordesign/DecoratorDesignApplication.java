package com.example.decoratordesign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DecoratorDesignApplication {
  public static void main(String[] args) {

    ApplicationContext context = SpringApplication.run(DecoratorDesignApplication.class, args);
    Long finalCost = context.getBean(BuildMilkTea.class).buildFruitBubblePuddingMilktea();
    System.out.println("You need to pay "+finalCost +"$ for : FruitBubblePuddingMilktea");
  }

}
