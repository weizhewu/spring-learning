package com.soft1851.spring.orm.app;

import com.alibaba.druid.pool.DruidDataSource;
import com.soft1851.spring.orm.config.SpringDataSourceConfig;
import com.soft1851.spring.orm.dao.PostDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Author: zw_w
 * @Date: 2020/3/19 8:32
 * @Description:
 */
public class SpringDataSourceTest {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringDataSourceConfig.class);
        //手动开启扫描
        ctx.scan("com.soft1851.spring.orm.config");
        DruidDataSource druidDataSource = (DruidDataSource) ctx.getBean("druidDataSource");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        jdbcTemplate.setDataSource(druidDataSource);
        PostDao postDao = (PostDao) ctx.getBean("postDao");
        System.out.println(postDao.countPostByForumId(1));
    }
}
