package com.soft1851.spring.webannotation.service.impl;


import com.soft1851.spring.webannotation.dao.RankDao;
import com.soft1851.spring.webannotation.entity.Rank;
import com.soft1851.spring.webannotation.service.RankService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName RankServiceImpl
 * @Description TODO
 * @Author w_wz
 * @Date 2020/3/27
 **/
@Service
//@Transactional(rollbackFor = Exception.class)
public class RankServiceImpl implements RankService {
    @Resource
    private RankDao rankDao;
    @Override
    public List<Rank> queryAll() {
        return rankDao.selectAll();
    }

    @Override
    public void addRank(Rank rank) {
      rankDao.insert(rank);
    }
    @Override
    public int[] batchInsert(List<Rank> ranks) {
        return rankDao.batchInsert(ranks);
    }
}