package com.sda.spring.javapoz4.service;

import org.springframework.stereotype.Component;

import java.util.Random;

//@Component
public class SomeService {

    private String message;

    public int value;


    public SomeService(String message){
        Random random = new Random();
        this.value = random.nextInt(100);
        this.message = message;
    }

    public void someAction(){
        System.out.println(message + " " + value);
    }
}
