package com.soft1851.spring.webannotation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/3/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    private String cover;
    private String name;
    private String introduction;
}
