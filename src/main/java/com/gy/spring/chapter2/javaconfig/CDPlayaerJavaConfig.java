package com.gy.spring.chapter2.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class CDPlayaerJavaConfig {

    @Bean
    public com.gy.spring.chapter2.javaconfig.CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

     @Bean
     public com.gy.spring.chapter2.javaconfig.CDPlayer cdPlayer() {
         return new CDPlayer(sgtPeppers());
    }


}
