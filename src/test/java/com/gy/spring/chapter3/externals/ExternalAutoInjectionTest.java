package com.gy.spring.chapter3.externals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

public class ExternalAutoInjectionTest {

  @RunWith(SpringJUnit4ClassRunner.class)
  @ContextConfiguration(classes=BlankDiscAutoConfig.class)
  public static class InjectFromProperties {
  
    @Autowired
    private BlankDiscAuto blankDisc;
    
    @Test
    public void assertBlankDiscProperties() {
      assertEquals("The Beatles", blankDisc.getArtist());
      assertEquals("Sgt. Peppers Lonely Hearts Club Band", blankDisc.getTitle());
    }
    
  }

  @RunWith(SpringJUnit4ClassRunner.class)
  @ContextConfiguration("classpath:chapter3/externals/placeholder-autoconfig.xml")
  public static class InjectFromProperties_XMLConfig {
  
    @Autowired
    private BlankDiscAuto blankDisc;
    
    @Test
    public void assertBlankDiscProperties() {
      assertEquals("The Beatles", blankDisc.getArtist());
      assertEquals("Sgt. Peppers Lonely Hearts Club Band", blankDisc.getTitle());
    }
    
  }

}