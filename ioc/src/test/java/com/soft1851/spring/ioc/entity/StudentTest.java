package com.soft1851.spring.ioc.entity;

import com.soft1851.spring.ioc.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @Author: zw_w
 * @Date: 2020/3/19 12:45
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class StudentTest {
    @Autowired
    private Student student;

    @Test
    public void print(){
        student.setId("1");
        System.out.println(student);
    }
}