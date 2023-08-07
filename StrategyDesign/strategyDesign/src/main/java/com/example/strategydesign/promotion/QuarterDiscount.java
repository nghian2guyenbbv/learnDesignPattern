package com.example.strategydesign.promotion;

public class QuarterDiscount implements IPromote{
  @Override
  public double doDiscount(double price) {
    return price * 3/4;
  }
}
