package com.gy.spring.chapter2.xmlconfig;

import org.springframework.beans.factory.annotation.Autowired;
//import javax.inject.Named;


public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc xxx)//这里的注入，如果通过xml文件描述的话，默认以参数名为检索对象
    {
        this.cd = xxx;
    }

    public void play() {
        cd.play();
    }
}
