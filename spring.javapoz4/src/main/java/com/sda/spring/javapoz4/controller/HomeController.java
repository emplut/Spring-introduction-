package com.sda.spring.javapoz4.controller;

import com.sda.spring.javapoz4.service.RandomNumberGeneratorService;
import com.sda.spring.javapoz4.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    public SomeService someService;

    @Qualifier("aboutService")
    @Autowired
    public  SomeService myService;

//    @Qualifier("smallNumberGenerator")
    @Autowired
    public RandomNumberGeneratorService randomNumberGeneratorService;

    public  HomeController (){
        //this.someService = new SomeService();
    }


    @GetMapping("/")
    public ModelAndView home(){
       // SomeService someService = new SomeService();
        someService.someAction();
        return new ModelAndView("home");
    }

    @GetMapping("/about")
    public ModelAndView about(){
        myService.someAction();
        return new ModelAndView("home");
    }

    @GetMapping("/contact")
    public ModelAndView contact(){
        System.out.println(randomNumberGeneratorService.generateNumber());
        return new ModelAndView();

    }



}
