package com.cmy.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cmy.mybatis.spring.User;


@RestController
public class RestTestController {

    @RequestMapping(value="/get-username",method=RequestMethod.GET)
    public String getUserName(@RequestParam(value="name") String name){
        return name;
    }
    
    @RequestMapping(value="/get-user-rest",method=RequestMethod.GET)
    public User getFavUser(){
    	User user = new User();
    	user.setId(1);
    	user.setUserName("xxx");
    	user.setUserAddress("dfasdf");
        return user;
    }
}
