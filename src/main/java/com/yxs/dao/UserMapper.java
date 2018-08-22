package com.yxs.dao;

import com.yxs.entity.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long sid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long sid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> findAll();
}