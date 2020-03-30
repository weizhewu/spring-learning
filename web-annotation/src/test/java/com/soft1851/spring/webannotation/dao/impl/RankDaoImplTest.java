package com.soft1851.spring.webannotation.dao.impl;

import com.soft1851.spring.webannotation.config.SpringDataSourceConfig;
import com.soft1851.spring.webannotation.spider.BiLiBiLiSpider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @Author: zw_w
 * @Date: 2020/3/28 16:35
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDataSourceConfig.class})
//WebAppConfiguration逐季雷默认为webapp目录，需要切换到src/main/resources目录
@WebAppConfiguration("src/main/resources")
public class RankDaoImplTest {

    @Resource
    private RankDaoImpl rankDao;

    @Test
    public void selectAll() {
        System.out.println(rankDao.selectAll());
    }

    @Test
    public void batchInsert() {
        rankDao.batchInsert(BiLiBiLiSpider.getRanks());
    }

    @Test
    public void insert() {
    }
}