package com.gy.spring.chapter2.mixedconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

//配置文件兼容code配置和xml配置
@Configuration
@Import(CDPlayerConfig.class)//import导入code配置类
@ImportResource("classpath:META-INF/spring/mix/cd-config.xml")//importResource导入xml配置文件
public class SoundSystemConfig {

}
