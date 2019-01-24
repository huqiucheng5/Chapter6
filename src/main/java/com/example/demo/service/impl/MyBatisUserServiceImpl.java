package com.example.demo.service.impl;

import com.example.demo.dao.MyBatisUserDao;
import com.example.demo.pojo.User;
import com.example.demo.service.MyBatisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/1/24.
 */
@Service
public class MyBatisUserServiceImpl implements MyBatisUserService {

    @Autowired
    private MyBatisUserDao myBatisUserDao = null;

    @Override
    public User getUser(Long id) {
        return myBatisUserDao.getUser(id);
    }
}
