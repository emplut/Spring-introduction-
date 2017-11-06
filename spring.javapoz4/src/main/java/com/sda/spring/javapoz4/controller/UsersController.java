package com.sda.spring.javapoz4.controller;

import com.sda.spring.javapoz4.model.User;
import com.sda.spring.javapoz4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ModelAndView getUser(@PathVariable("id") int id){
      ModelAndView modelAndView = new ModelAndView("user");
      User user = userService.getUser(id);
      modelAndView.addObject("user",user);
      return modelAndView;
    }

    @GetMapping(params = {"lastName"})
    public ModelAndView getUsers (@RequestParam("lastName") String lastName){
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject(lastName);
        return modelAndView;
    }

    // B1. nowa metoda na sciezke / users
    // B2. parameter firstName
    // B3. w UsersService piszemy metode getUsersByFirstName -> List<User>
    // B4. System.out.println(lista)


    //B1
    @GetMapping(params = {"firstName"})
    public ModelAndView getUsersByFirstName (@RequestParam("firstName") String firstName){
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("users", userService.getUsersByFirstName(firstName));
        return modelAndView;
    }
    //A4 (RequestMapping)
    @GetMapping("/example")
    public ModelAndView getExampleUser(){
        System.out.println(userService.getExampleUser());
        return new ModelAndView("users");
    }
}
