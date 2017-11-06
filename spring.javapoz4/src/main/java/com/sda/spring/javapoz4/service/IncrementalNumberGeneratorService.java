package com.sda.spring.javapoz4.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class IncrementalNumberGeneratorService implements NumberGenerator {

    private int couter;

    public IncrementalNumberGeneratorService(){
        System.out.println("Hello from constructor");
    }

    @Override
    public int generateNumber() {
        return couter++;
    }
}
