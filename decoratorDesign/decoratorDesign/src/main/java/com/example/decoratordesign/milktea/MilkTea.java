package com.example.decoratordesign.milktea;

// core class for milktea
public class MilkTea implements IMilkTea{
  @Override
  public long getCost() {
    System.out.println("Milktea price is 5$");
    return 5;
  }
}
