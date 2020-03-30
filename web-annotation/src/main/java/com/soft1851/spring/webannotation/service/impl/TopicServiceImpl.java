package com.soft1851.spring.webannotation.service.impl;

import com.soft1851.spring.webannotation.dao.TopicDao;
import com.soft1851.spring.webannotation.entity.Topic;
import com.soft1851.spring.webannotation.service.TopicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wzw
 * @date 2020/3/27
 * @Transactional(rollbackFor = Exception.class)如果类加了这个注释，那么
 * 这个类方法里面的方法抛出异常 就会回滚 数据库里面的数据也会回滚
 */
@Service
//@Transactional()
public class TopicServiceImpl implements TopicService {
    @Resource
    private TopicDao topicDao;

    @Override
    public List<Topic> queryAll() {
        return topicDao.selectAll();
    }

    @Override
    public int[] batchInsert(List<Topic> topics) {
        return  topicDao.batchInsert(topics);
    }

    @Override
    public void addTopic(Topic topic) {
        topicDao.insert(topic);
//        int a = 1 / 0;
    }
}
