package com.yxs.controller;

import com.github.pagehelper.PageInfo;
import com.yxs.entity.User;
import com.yxs.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autor yuxinsheng
 * @date 2018/8/23 0:22
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public void add(@RequestBody User user) {
        try {
            this.userService.create(user);
            logger.info("添加用户成功");
        } catch (Exception e) {
            logger.error("添加用户失败", e);
        }
    }

    @RequestMapping("/find-by-page")
    public PageInfo<User> findByPage(int pageNo, int pageSize) {
        try {
            return this.userService.findByPage(pageNo, pageSize);
        } catch (Exception e) {
            logger.error("分页查找失败");
            return null;
        }
    }


}
