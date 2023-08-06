package com.example.observer.observerDesign.Obser;

import com.example.observer.observerDesign.DataVideo;
import com.example.observer.observerDesign.Subject;

public class EmailObserver extends Observer{

  public EmailObserver(Subject subject) {
    this.subject = subject;
    this.subject.addObserver(this);
  }

  @Override
  public void notifyOb(Subject subject, Object ob) {
    if(subject instanceof DataVideo){
      System.out.println(
          "Email notify with detail DataVideo :" + subject.getVideoName() + " description: " + subject.getVideoDesc());
    }
  }
}

