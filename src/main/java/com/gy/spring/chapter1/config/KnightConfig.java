package com.gy.spring.chapter1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gy.spring.chapter1.BraveKnight;
import com.gy.spring.chapter1.Knight;
import com.gy.spring.chapter1.Quest;
import com.gy.spring.chapter1.SlayDragonQuest;

@Configuration
public class KnightConfig {

  @Bean
  public Knight knight() {
    return new BraveKnight(quest());
  }//这里实现构造器注入
  
  @Bean
  public Quest quest() {
    return new SlayDragonQuest(System.out);
  }

}
