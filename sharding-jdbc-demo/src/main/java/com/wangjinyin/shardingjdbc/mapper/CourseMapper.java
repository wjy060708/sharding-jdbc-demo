package com.wangjinyin.shardingjdbc.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wangjinyin.shardingjdbc.entity.Course;

@Mapper
public interface CourseMapper extends BaseMapper<Course> {

}
