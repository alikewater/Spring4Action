package com.gy.spring.chapter1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldBeanTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sayHello() {
        HelloWorldBean obj = new HelloWorldBean();
        System.out.println(obj.sayHello());
    }
}