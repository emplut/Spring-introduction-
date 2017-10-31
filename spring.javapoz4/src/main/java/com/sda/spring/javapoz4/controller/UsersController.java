package com.sda.spring.javapoz4.controller;

import com.sda.spring.javapoz4.service.RandomNumberGeneratorService;
import com.sda.spring.javapoz4.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersController {

    @Autowired
    private SomeService someService;

//    @Qualifier("smallNumberGenerator")
    @Autowired
    private RandomNumberGeneratorService randomNumberGeneratorService;

    @GetMapping ("/users")
    public ModelAndView users(){
        someService.someAction();
        return new ModelAndView("home");
    }

    @GetMapping("/contact-us")
    public ModelAndView contactUs(){
        return new ModelAndView("home");
    }
}
