package com.example.decoratordesign.milktea.component;

import com.example.decoratordesign.milktea.IMilkTea;
import com.example.decoratordesign.milktea.MilkTeaDecorators;

public class Bubble extends MilkTeaDecorators {
  public Bubble (IMilkTea iMilkTea){
    super(iMilkTea);
  }
  @Override
  public long getCost() {
    System.out.println("Add 2$ for Bubble");
    return super.getCost() + 2;
  }
}
