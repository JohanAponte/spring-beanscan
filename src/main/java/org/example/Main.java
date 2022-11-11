package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//Instantiating a Container
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //Creating objects
        //Option 1. Normal way
        //CalculatorService calculatorService2 = new CalculatorService();

        //Option 2. Getting a Spring Object
        CalculatorService calculatorService = (CalculatorService) context.getBean("calculatorService");

        System.out.println(calculatorService.helloWorld());


        //Example 2:
        BillCreator billCreator = (BillCreator) context.getBean("billCreator");
    }
}