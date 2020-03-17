package com.soft1851.spring.ioc.entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @Author: zw_w
 * @Date: 2020/3/17 12:01
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/beans.xml"})
public class BookTest {

    @Autowired
    private Book book;

    @Test
    public void testToString() {
        book.setPrice(88.8);
        book.setName("java");
        System.out.println(book);
    }
}