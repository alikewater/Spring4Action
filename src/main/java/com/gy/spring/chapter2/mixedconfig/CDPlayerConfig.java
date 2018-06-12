package com.gy.spring.chapter2.mixedconfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
  
  @Bean
  public CDPlayer cdPlayer(CompactDisc compactDisc) {//如果是引用的xml文件中的，那么需要id对应
    return new CDPlayer(compactDisc);
  }

}
