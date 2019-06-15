package com.zhangjie.miaosha.service.Impl;

import com.zhangjie.miaosha.dataobject.User;
import com.zhangjie.miaosha.dao.UserDao;
import com.zhangjie.miaosha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author jason
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getById(int id) {
        return userDao.getById(1);
    }

    /**
     * tx
     * @return boolean
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean tx() {
        User u1= new User();
        u1.setId(2);
        u1.setName("2222");
        userDao.insert(u1);

        User u2= new User();
        u2.setId(1);
        u2.setName("11111");
        userDao.insert(u2);

        return true;
    }
}
