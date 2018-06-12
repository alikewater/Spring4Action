package com.gy.spring.chapter2.xmlconfig.propinjection;
import com.gy.spring.chapter2.xmlconfig.CompactDisc;
import com.gy.spring.chapter2.xmlconfig.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;


public class CDPlayer implements MediaPlayer {
  private CompactDisc compactDisc;

  @Autowired
  public void setCompactDisc(CompactDisc compactDisc) {
    this.compactDisc = compactDisc;
  }

  public void play() {
    compactDisc.play();
  }

}
