package org.example;

import org.springframework.stereotype.Component;

@Component
public class BillCreator {

    private CalculatorService calculatorService;

    public BillCreator(CalculatorService calculatorServiceAtt) {
        this.calculatorService = calculatorServiceAtt;
        System.out.println("Instantiating a Bill Container");
    }

}
