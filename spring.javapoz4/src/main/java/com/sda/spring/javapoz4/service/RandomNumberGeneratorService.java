package com.sda.spring.javapoz4.service;

import org.springframework.stereotype.Component;

import java.util.Random;

//@Component
public class RandomNumberGeneratorService implements NumberGenerator {

    private int bound;

    private int offset;

    private Random random;


    public RandomNumberGeneratorService(int bound, int offset, Random random) {
        this.bound = bound;
        this.offset = offset;
        this.random = new Random();
    }

    public RandomNumberGeneratorService(int bound) {
        this(bound , 0);
    }

    public RandomNumberGeneratorService() {
        this(100 , 0);
    }

    public RandomNumberGeneratorService(int bound, int offset) {
        this.bound = bound;
        this.offset = offset;
    }

    public int generateNumber(){
        Random random = new Random();
        return random.nextInt(bound) + offset;
    }

    public int getBound() {
        return bound;
    }

    public void setBound(int bound) {
        this.bound = bound;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}

// 1. Ta klasa zwraca losowa liczbe
// 2. Rejestrujemy ja w kontekscie springa
// 3. wstrzykujemy ja do HOme i Users Controllerow @Autowire (wstrzykujemy)
// 4. Uzywamy w metodach #GetMapping
// 5. Dodajemy GetMapping na /contact-us - UsersController

// Chcemy efektywnie dostać 2 beany - smallNumberGenerator i bigNumberGenerator
//pierwsze ma zwracać liczby z zakresu 0-50
//drugi z zakresu 1000-10000
//wstrzykujemy je do controllerow, pierwszy do UserController drugi do HomeController
//Uzywamy ich odpowiednio w metodach @GetMapping
//Uzywamy Qualifier