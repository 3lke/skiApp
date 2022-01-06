package com.accenture.villakunterbunt.calculator;

public class Calculator {
    /**
     * Adds two numbers
     */
    public int add(int a, int b) {
        System.out.println("I am adding a + b ");
        return a + b;
    }

    /**
     * Substracts two numbers
     */
    public int minus(int a, int b) {
        int result = a - b;
        return result;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
