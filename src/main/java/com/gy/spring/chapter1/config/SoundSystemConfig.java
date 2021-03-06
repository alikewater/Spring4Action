package com.gy.spring.chapter1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.gy.spring.chapter1",
               excludeFilters = { @Filter(Configuration.class) })
public class SoundSystemConfig {
}
