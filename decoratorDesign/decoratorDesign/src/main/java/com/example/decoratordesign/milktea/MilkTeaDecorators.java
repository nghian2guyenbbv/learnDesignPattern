package com.example.decoratordesign.milktea;

// Decorator class for milktea
public abstract class MilkTeaDecorators implements IMilkTea{
  private IMilkTea milkTea;
  public MilkTeaDecorators(IMilkTea milkTea ) {
    this.milkTea = milkTea;
  }

  @Override
  public long getCost() {
    return milkTea.getCost();
  }
}
