package com.gy.spring.chapter2;

import com.gy.spring.chapter2.xmlconfig.CompactDisc;
import com.gy.spring.chapter2.xmlconfig.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:META-INF/spring/cdplayer.xml"})
@ContextConfiguration(locations={"file:src/main/resources/META-INF/spring/cdplayer.xml"})
public class CDPlayerXmlConfigTest {

    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer mp;
    @Test
    public void play() {

        cd.play();
    }

    @Test
    public  void CDPlay()
    {
        mp.play();
    }


}