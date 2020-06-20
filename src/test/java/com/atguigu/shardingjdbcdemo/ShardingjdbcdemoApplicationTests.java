package com.atguigu.shardingjdbcdemo;

import com.atguigu.shardingjdbcdemo.entity.Course;
import com.atguigu.shardingjdbcdemo.mapper.CourseMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingjdbcdemoApplicationTests {


    @Autowired
    private CourseMapper courseMapper;



    @Test
    public void addCourseTest() {

        for (int i = 0; i < 10; i++) {
            Course course = new Course();
            course.setCName("java"+i);
            course.setCStatus("Normal"+i);
            course.setUserId(100L);
            courseMapper.insert(course);
        }

    }


    //水平分表查询
    @Test
    public void selCourseTest() {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("c_name","java");
        queryWrapper.eq("c_status","Normal3");

        Course course = courseMapper.selectOne(queryWrapper);

        System.out.println(course);
    }




}
