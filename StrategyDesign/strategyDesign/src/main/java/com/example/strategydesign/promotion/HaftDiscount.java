package com.example.strategydesign.promotion;

public class HaftDiscount implements IPromote{
  @Override
  public double doDiscount(double price) {
    return price * 1/2;
  }
}
