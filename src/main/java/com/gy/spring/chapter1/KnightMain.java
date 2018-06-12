package com.gy.spring.chapter1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.
                   ClassPathXmlApplicationContext;

public class KnightMain {

  public static void main(String[] args) throws Exception {

      //从标注配置类加载上下文
      AnnotationConfigApplicationContext context1 =
                new AnnotationConfigApplicationContext(com.gy.spring.chapter1.config.KnightConfig.class);
      Knight knight1 = context1.getBean(Knight.class);
      knight1.embarkOnQuest();
      context1.close();
      ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext(
                "META-INF/spring/minstrel.xml");
        //从classpath的相对位置加载配置文件，这里的配置文件放在resource下面
      Knight knight = context.getBean(Knight.class);
      knight.embarkOnQuest();
      context.close();

  }

}
