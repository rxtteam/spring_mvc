package com.cmy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cmy.mybatis.spring.User;
import com.cmy.mybatis.spring.UserDaoMapper;
 
@Controller
public class HelloController {
 
	@Autowired
	private UserDaoMapper userDaoMapper;
	
    @RequestMapping("/hello")
    public String hello(Model model) {
         
        model.addAttribute("greeting", "Hello Spring MVC");  
        return "hello"; 
    }
    
    @RequestMapping("/hello2")
    public String hello(){        
        return "hellobig";
    }
 
    @RequestMapping("/get-user")
    public String getUser(Model model){        
    	 User user = userDaoMapper.selectUserByID(1);
    	 
    	 model.addAttribute("username", user.getUserName());
    	 model.addAttribute("address", user.getUserAddress());
    	 
    	 return "user_info"; 
    }
}