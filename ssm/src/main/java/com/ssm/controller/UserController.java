package com.ssm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.model.UserInfo;
import com.ssm.service.IUserService;

@Controller   
@RequestMapping("/user")   
public class UserController {

	@Autowired   
    private IUserService userService;   
         
    @RequestMapping("/userList")   
    public String userList(HttpServletRequest request,Model model){   
        List<UserInfo> uList = userService.getAllUser();   
        model.addAttribute("uList", uList);   
        return "userList";   
    }   
         
    @RequestMapping("/showUser")   
    public String showUser(HttpServletRequest request,Model model){   
        int userId = Integer.parseInt(request.getParameter("id"));   
        UserInfo user = userService.getUserById(userId);   
        model.addAttribute("user", user);   
        return "showUser";   
    }   
         
    @RequestMapping("/userinfo")   
    public String addUserUI(){   
        return "userinfo";   
    }   
         
    @RequestMapping("/addUser")   
    public String addUser(HttpServletRequest request,Model model){   
    	UserInfo user = new UserInfo();   
        user.setName(String.valueOf(request.getParameter("name")));   
        user.setPassword(String.valueOf(request.getParameter("password")));   
        user.setAge(Integer.parseInt(String.valueOf(request.getParameter("age"))));   
        userService.insertUser(user);
        //(user);   
        return "redirect:/user/userList";   
    }   
}
