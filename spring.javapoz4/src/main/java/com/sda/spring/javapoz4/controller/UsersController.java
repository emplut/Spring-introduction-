package com.sda.spring.javapoz4.controller;

import com.sda.spring.javapoz4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @GetMapping("/example")
    public ModelAndView getExampleUser(){
        System.out.println(userService.getExampleUser());
        return new ModelAndView("users");
    }
}
