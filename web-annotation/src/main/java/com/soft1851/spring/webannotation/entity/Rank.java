package com.soft1851.spring.webannotation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Rank
 * @Description TODO
 * @Author 田震
 * @Date 2020/3/27
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rank {
    private  Integer id;
    private  String title;
    private  String author;
    private  String pic;
    private  String duration;

}