package com.soft1851.spring.ioc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: zw_w
 * @Date: 2020/3/17 9:34
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private String id;
    private String name;
    private List<String> hobbies;
    private List<Phone> phones;
    private Map<String,Integer> scores;
    private Set sex;

}


