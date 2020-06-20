package com.atguigu.shardingjdbcdemo.entity;

import lombok.Data;

/**
 * @Copyright 成都可迅捷科技有限公司
 * @ClassName Course
 * @Description
 * @Author baoruizhe
 * @Date 2020/6/19 14:14
 * @Version 1.0
 **/
@Data
public class Course {

    private Long cId;
    private Long userId;
    private String cName;
    private String cStatus;

}
