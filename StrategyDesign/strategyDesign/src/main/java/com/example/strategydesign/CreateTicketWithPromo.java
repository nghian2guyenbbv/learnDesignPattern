package com.example.strategydesign;

import com.example.strategydesign.promotion.HaftDiscount;
import com.example.strategydesign.promotion.QuarterDiscount;

public class CreateTicketWithPromo {
  public static void main(String[] args) {
    Ticket ticket = new Ticket("ticket_name", 50.0);
    ticket.setPromote(new HaftDiscount());
    ticket.setPromote(new QuarterDiscount());
    System.out.println("final Price is: "+ticket.getPricePromote());
  }
}
