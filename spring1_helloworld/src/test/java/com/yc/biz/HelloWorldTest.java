package com.yc.biz;

import com.yc.AppConfig;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class HelloWorldTest extends TestCase {
    private ApplicationContext ac;
    @Override
    @Before
    public  void setUp(){
        ac = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    @Test
    public void testhello() {
        HelloWorld hw= (HelloWorld) ac.getBean("helloWorld");
        hw.hello();

        HelloWorld hw2= (HelloWorld) ac.getBean("helloWorld");
        hw2.hello();

    }
}