package com.example.learnspringframework.examples.a2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class ExerciseLauncherApplication {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(ExerciseLauncherApplication.class)) {
            System.out.println("The Max is " + context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}