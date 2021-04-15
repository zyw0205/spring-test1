package com.yc.biz;

import com.yc.AppConfig;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//因为在这个类继承 自 TestCase,所以这个类为测试用类，这个类中的所有以test开头的方法都成为测试方法
//就不用加 @Test注解
public class StudentBizImplTest extends TestCase {
    //容器
    ApplicationContext ac;
    private StudentBizImpl studentBiz;

    @Before
    public void setUp()  {
        //  java.lang.String
        ac = new AnnotationConfigApplicationContext(AppConfig.class);
        studentBiz = (StudentBizImpl) ac.getBean("studentBizImpl");
    }

    @Test
    public void testAdd() {
        studentBiz.add("李四");
    }

    @Test
    public void testUpdate() {
        studentBiz.update("李四");
    }
}