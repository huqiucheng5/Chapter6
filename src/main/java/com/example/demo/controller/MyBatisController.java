package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.MyBatisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2019/1/24.
 */
@Controller
@RequestMapping("/mybatis")
public class MyBatisController {

    @Autowired
    private MyBatisUserService myBatisUserService = null;

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(Long id) {
        return myBatisUserService.getUser(id);
    }
}
