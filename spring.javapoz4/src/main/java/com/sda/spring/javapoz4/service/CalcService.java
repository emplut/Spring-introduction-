package com.sda.spring.javapoz4.service;

import org.springframework.stereotype.Component;

//@Component
public class CalcService {

    private String message;

    public CalcService(String message) {
        this.message = message;
    }

    public int sum (int a, int b){
        System.out.println(message);
        return a+b;
    }

    public int mulltiply (int a, int b){
        System.out.println(message);
        return a*b;
    }

    /*  1.zaimplementowac metode
        2. utworzyc w kontekscie springa obiekt typu calcService
        3. wstrzyknac to do nowego controllera, CalcController
        4. Wstrzyknac tego beana w metodach @GetMapping
        ("/calc/add") oraz @GetMapping ("/calc/multiply")
        5.  liczby wygenerowac losowo za pomoca klasy RandomNumberGeneratorService
        6. Wyswietl wynik za pomoca souta
     */
}
