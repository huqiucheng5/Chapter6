package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2019/1/24.
 */
@Repository
public interface MyBatisUserDao {

    public User getUser(Long id);
}
