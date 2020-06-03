package com.xin.controller;

import com.xin.entity.User;
import com.xin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/query")
    public String getAllUsers(Model model){

        List<User> userList = userService.getAllUsers();

        model.addAttribute("userList",userList);

        return "userlist";
    }
}
