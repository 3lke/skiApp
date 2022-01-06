package com.accenture.villakunterbunt.calculator.actions;

import com.accenture.villakunterbunt.calculator.Calculator;

public class AdditionAction {

    Calculator calculator;

    public AdditionAction() {
        calculator = new Calculator();
    }

    public void addition(int zahl1, int zahl2) {
        int x = calculator.add(zahl1, zahl2);
        System.out.println("Result of add: " + x);
    }

}
