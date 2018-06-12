package com.gy.spring.chapter2.autoconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//通过注解实现配置，@Configuration实现将该类指定为Spring的配置类
//@ComponentScan表明可以实现自动检索包，不显示声明Bean的创建逻辑，默认扫描配置文件包之中的类
//扫描到了JavaConfig文件中定义的一个@Bean
@ComponentScan(basePackages = "com.gy.spring.chapter2.autoconfig")//默认的位置可以不显式的写出来
@Configuration
public  class CDPlayerAutoConfig {

}
