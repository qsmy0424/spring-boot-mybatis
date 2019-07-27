package com.qsmy.mybatis.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author qsmy
 * @date 2019-07-24
 */
@AllArgsConstructor
@Data
public class Users {
    private Integer id;
    private String name;
    private Integer age;
}
