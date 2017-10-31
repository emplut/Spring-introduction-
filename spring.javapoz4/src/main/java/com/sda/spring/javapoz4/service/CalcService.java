package com.sda.spring.javapoz4.service;

public class CalcService {

    public int sum (int a, int b){
        return a+b;
    }

    public int mulltiply (int a, int b){
        return a*b;
    }

    /*1.zaimplementowac metode
    2. utworzyc w kontekscie springa obiekt typu calcService
    3. wstrzyknac to do nowego controllera, CalcController
    4. Wstrzyknac tego beana w metodach @GetMapping
        ("/calc/add") oraz @GetMapping ("/calc/multiply")
    5.  liczby wygenerowac losowo za pomoca klasy RandomNumberGeneratorService
    6. Wyswietl wynik za pomoca souta
     */
}
