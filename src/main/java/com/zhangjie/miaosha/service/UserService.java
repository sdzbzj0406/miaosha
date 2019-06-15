package com.zhangjie.miaosha.service;

import com.zhangjie.miaosha.dataobject.User;

public interface UserService {

    /**
     * 根据id查询用户
     * @param id id
     * @return 用户
     */
    User getById(int id);

    /**
     * tx
     * @return boolean
     */
    boolean tx();
}
