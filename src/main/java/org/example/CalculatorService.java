package org.example;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

    public CalculatorService(){
        System.out.println("Instantiating a Calculator Container");
    }
    public String helloWorld(){
        return "Hello World!";
    }
}
