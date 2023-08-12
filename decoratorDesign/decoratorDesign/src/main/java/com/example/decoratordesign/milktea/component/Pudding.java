package com.example.decoratordesign.milktea.component;

import com.example.decoratordesign.milktea.IMilkTea;
import com.example.decoratordesign.milktea.MilkTeaDecorators;

public class Pudding extends MilkTeaDecorators {
  public Pudding (IMilkTea milkTea){
    super(milkTea);
  }
  @Override
  public long getCost() {
    System.out.println("Add 4$ for pudding ");
    return super.getCost() + 4;
  }
}
