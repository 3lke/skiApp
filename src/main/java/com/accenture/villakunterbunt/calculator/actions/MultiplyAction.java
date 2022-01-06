package com.accenture.villakunterbunt.calculator.actions;

import com.accenture.villakunterbunt.calculator.Calculator;

public class MultiplyAction {

    public void multiplication(Calculator calc, int zahl1, int zahl2) {
        int x = calc.multiply(zahl1, zahl2);
        System.out.println("Result of minus : " + x);
    }

}
