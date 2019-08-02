package com.yxs.service;

import com.github.pagehelper.PageInfo;
import com.yxs.entity.User;

/**
 * @autor yuxinsheng
 * @date 2018/8/23 0:19
 */
public interface UserService {

    int create(User user);

    PageInfo findByPage(int pageNo, int pageSize);
}
