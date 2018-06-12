package com.gy.spring.chapter2.autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import javax.inject.Named;


//@Named("cdPlayer")//在jee包中定义的
@Component//默认情况下，类名作为Bean ID
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired(required = false)//表示如果没有自动关联上，不报异常
    public CDPlayer(CompactDisc cd)
    {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
