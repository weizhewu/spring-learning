package com.soft1851.spring.ioc.app;

import com.soft1851.spring.ioc.entity.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zw_w
 * @Date: 2020/3/17 9:06
 * @Description:
 */
public class HelloTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello)ac.getBean("hello");
        hello.sayHello();
    }
}
