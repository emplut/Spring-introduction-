package com.sda.spring.javapoz4.config;

import com.sda.spring.javapoz4.service.RandomNumberGeneratorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NumberGeneratorConfig {

    @Bean
    public RandomNumberGeneratorService smallNumberGenerator (){
        return new RandomNumberGeneratorService(50,0);
    }

    @Bean
    public RandomNumberGeneratorService bigNumberGenerator (){
        RandomNumberGeneratorService randomNumberGeneratorService = new RandomNumberGeneratorService();
        randomNumberGeneratorService.setBound(9000);
        randomNumberGeneratorService.setOffset(1000);
        return randomNumberGeneratorService;
    }

}
