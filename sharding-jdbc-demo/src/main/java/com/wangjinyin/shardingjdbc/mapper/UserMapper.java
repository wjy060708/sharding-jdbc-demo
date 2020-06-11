package com.wangjinyin.shardingjdbc.mapper;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wangjinyin.shardingjdbc.entity.User;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
