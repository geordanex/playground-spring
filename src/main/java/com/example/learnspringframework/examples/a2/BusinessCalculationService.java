package com.example.learnspringframework.examples.a2;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessCalculationService {

    private final DataService dataService;

    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retriveData()).max().orElse(0);
    }
}
