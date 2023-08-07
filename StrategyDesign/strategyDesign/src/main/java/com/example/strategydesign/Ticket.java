package com.example.strategydesign;

import com.example.strategydesign.promotion.IPromote;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Data
public class Ticket {
  List<IPromote> listPromote = new ArrayList<IPromote>();
  private String name;
  private double price;

  public Ticket(String ticketName, double price) {
    this.name = ticketName;
    this.price = price;
  }

  public void setPromote(IPromote promote){
    listPromote.add(promote);
  }

  public double getPricePromote() {
    AtomicReference<Double> finalPrice = new AtomicReference<>(getPrice());
    listPromote.stream().forEach(pro -> finalPrice.set(pro.doDiscount(finalPrice.get())));
    return finalPrice.get();
  }
}
