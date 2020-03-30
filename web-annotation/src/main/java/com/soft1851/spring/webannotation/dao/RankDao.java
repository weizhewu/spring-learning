package com.soft1851.spring.webannotation.dao;

import com.soft1851.spring.webannotation.entity.Rank;

import java.util.List;

/**
 * @ClassName RankDao
 * @Description TODO
 * @Author w_wz
 * @Date 2020/3/27
 **/
public interface RankDao {
    /**
     * 搜索全部
     * @return
     */
    List<Rank> selectAll();

    /**
     * 批量插入
     * @param ranks
     * @return
     */
    int [] batchInsert(List<Rank> ranks);

    /**
     * 新增单个
     * @param
     * @return
     */
    int insert(Rank rank);
}
