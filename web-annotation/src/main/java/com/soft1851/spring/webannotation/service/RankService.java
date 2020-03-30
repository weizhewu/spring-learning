package com.soft1851.spring.webannotation.service;

import com.soft1851.spring.webannotation.entity.Rank;

import java.util.List;

/**
 * @ClassName RankService
 * @Description TODO
 * @Author w_wz
 * @Date 2020/3/27
 **/
public interface RankService {
    /**
     * 查询所有
     * @return
     */
    List<Rank> queryAll();

    /**
     * 新增单个
     * @param rank
     */
    void  addRank(Rank rank);

    /**
     * 批量增加
     * @param ranks
     * @return
     */

    int[] batchInsert(List<Rank> ranks);

}
