package com.example.observer.observerDesign;

import com.example.observer.observerDesign.Obser.EmailObserver;
import com.example.observer.observerDesign.Obser.PhoneObserver;

public class DataVideo extends Subject{

  public DataVideo(String videoName, String videoDesc, String videoContent) {
    this.videoName = videoName;
    this.videoDesc = videoDesc;
    this.videoContent = videoContent;
  }

  public void uploadVideo() {
    notifyAfterUploadVideo();
  };
}
