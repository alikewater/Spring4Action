package com.gy.spring.chapter2;

import com.gy.spring.chapter2.javaconfig.CDPlayaerJavaConfig;
import com.gy.spring.chapter2.javaconfig.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//注意junit版本要在4.12以上才行
@ContextConfiguration(classes=CDPlayaerJavaConfig.class)
public class CDPlayerJavaConfigTest {

    @Autowired
    private CompactDisc cd;

    @Test
    public void play() {

        cd.play();
    }

}