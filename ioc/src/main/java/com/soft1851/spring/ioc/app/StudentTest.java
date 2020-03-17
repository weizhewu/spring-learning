package com.soft1851.spring.ioc.app;

import com.soft1851.spring.ioc.config.AppConfig;
import com.soft1851.spring.ioc.entity.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;

/**
 * @Author: zw_w
 * @Date: 2020/3/17 20:04
 * @Description:
 */
public class StudentTest {
    public static void main(String[] args) {
        //生成基于注解配置的应用上下文对象
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        //手动开启扫描
        ctx.scan("com.soft1851.spring.ioc.config");
//        ctx.refresh();
        Student student = (Student) ctx.getBean("student");
        Set set = new HashSet();
        set.add("男");
        student.setSex(set);
        Map<String,Integer> map = new HashMap<>();
        map.put("语文",55);
        map.put("数学",36);
        student.setScores(map);
        List<String> list = new ArrayList<>();
        list.add("音乐");
        list.add("阅读");
        student.setHobbies(list);

        System.out.println(student);

    }
}
