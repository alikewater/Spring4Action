package com.gy.spring.chapter2.mixedconfig;

import org.springframework.beans.factory.annotation.Autowired;
//import javax.inject.Named;


public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    public CDPlayer(CompactDisc cd)
    {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
