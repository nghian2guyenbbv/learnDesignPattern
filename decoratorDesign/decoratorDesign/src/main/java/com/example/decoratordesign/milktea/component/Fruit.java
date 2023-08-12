package com.example.decoratordesign.milktea.component;

import com.example.decoratordesign.milktea.IMilkTea;
import com.example.decoratordesign.milktea.MilkTeaDecorators;

public class Fruit extends MilkTeaDecorators {
  public Fruit (IMilkTea milkTea) {
    super(milkTea);
  }
  @Override
  public long getCost() {
    System.out.println("Add 1$ for Fruit");
    return super.getCost() + 1;
  }
}
