package com.example.scientificcalculator;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScientificCalculatorApplication {

    public static void main(String[] args) {
        ScientificCalculator sc = new ScientificCalculator();
        sc.display();
    }

}
