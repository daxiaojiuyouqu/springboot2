package com.yxs.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yxs.dao.UserMapper;
import com.yxs.entity.User;
import com.yxs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @autor yuxinsheng
 * @date 2018/8/23 0:20
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int create(User user) {
        return this.userMapper.insert(user);
    }

    @Override
    public PageInfo<User> findByPage(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<User> users = this.userMapper.findAll();
        return new PageInfo(users);
    }
}
