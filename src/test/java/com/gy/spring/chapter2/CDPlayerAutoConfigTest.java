package com.gy.spring.chapter2;

import com.gy.spring.chapter2.autoconfig.CDPlayerAutoConfig;
import com.gy.spring.chapter2.autoconfig.CompactDisc;
import com.gy.spring.chapter2.autoconfig.MediaPlayer;
import org.junit.Test;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)//注意junit版本要在4.5以上才行
@ContextConfiguration(classes=CDPlayerAutoConfig.class)
//@ContextConfiguration(locations = "METS-INF.spring/cdplayer_auto.xml")
public class CDPlayerAutoConfigTest {

    @Autowired
    private CompactDisc compactDisc;


    @Test
    public void play() {
        compactDisc.play();
    }

}