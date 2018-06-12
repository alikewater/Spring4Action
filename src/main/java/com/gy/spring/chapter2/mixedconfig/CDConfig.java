package com.gy.spring.chapter2.mixedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {
  @Bean//这种bean的id为函数名称
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }
}