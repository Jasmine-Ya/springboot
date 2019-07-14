package com.jasmine.controller;


import com.jasmine.pojo.Users;
import com.jasmine.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UsersService usersService;

    /**
     * 页面跳转
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page) {
        return page;
    }



    @RequestMapping("/get")
    public String getAllUsers(Model model) {
        List<Users> allUsers = usersService.getAllUsers();
        System.err.println(allUsers.size());
        model.addAttribute("all",allUsers);
        return "list";
    }
}

