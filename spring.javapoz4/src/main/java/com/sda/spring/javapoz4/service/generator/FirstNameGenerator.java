package com.sda.spring.javapoz4.service.generator;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FirstNameGenerator {

    private List<String> names;

    public FirstNameGenerator(){
        names = new ArrayList<>();
        names.add("Jan");
        names.add("Andrzej");
        names.add("Anna");
        names.add("Karolina");
    }

    public String getRandomFirstName(){
        Random random = new Random ();
        int randomIndex = random.nextInt(names.size());
        return names.get(randomIndex);
    }

}
// Zimplementować obie klasy FirstNameGenerator i LastNameGenerator
// Zarejestrowac je w konteksie Springa
// wstrzyknac je do UserService i je tam wykorzystac (getExampleUser)