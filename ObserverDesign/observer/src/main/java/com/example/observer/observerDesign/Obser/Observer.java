package com.example.observer.observerDesign.Obser;

import com.example.observer.observerDesign.Subject;


public abstract class Observer {
  public Subject subject;
  public abstract void notifyOb(Subject subject, Object ob);
}
