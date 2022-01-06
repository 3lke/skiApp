package com.accenture.villakunterbunt.calculator.actions;

import com.accenture.villakunterbunt.calculator.Calculator;

public class SubstractionAction {
    public SubstractionAction() {
    }

    public void substraction(Calculator calc, int zahl1, int zahl2) {
        int x = calc.minus(zahl1, zahl2);
        System.out.println("Result of minus : " + x);
    }

}
