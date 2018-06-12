package com.gy.spring.chapter2;

import com.gy.spring.chapter2.mixedconfig.CompactDisc;
import com.gy.spring.chapter2.mixedconfig.MediaPlayer;
import com.gy.spring.chapter2.mixedconfig.SoundSystemConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = SoundSystemConfig.class) 导入类
//@ContextConfiguration(locations = "file:src/main/resources/META-INF/spring/mix/soudsys.xml")//导入配置文件
@ContextConfiguration(locations = "file:src/main/resources/META-INF/spring/mix/soudsys01.xml")//导入配置文件

public class CDPlayerMixConfigTest {

    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer mp;

    @Test
    public void play() {

        cd.play();
    }

    @Test
    public void cdPlay()
    {
        mp.play();
    }
}