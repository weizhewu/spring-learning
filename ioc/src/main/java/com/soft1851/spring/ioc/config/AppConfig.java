package com.soft1851.spring.ioc.config;

import com.soft1851.spring.ioc.entity.Book;
import com.soft1851.spring.ioc.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * @Author: zw_w
 * @Date: 2020/3/17 11:40
 * @Description:
 */
@Configuration
public class AppConfig {
    @Bean
    public Book book(){
        return new Book();
    }

    @Bean
    public Student student(){
        return new Student();
    }
}
