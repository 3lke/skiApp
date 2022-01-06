package com.accenture.villakunterbunt.calculator;

import com.accenture.villakunterbunt.calculator.actions.AdditionAction;
import com.accenture.villakunterbunt.calculator.actions.ExitAction;
import com.accenture.villakunterbunt.calculator.actions.MultiplyAction;
import com.accenture.villakunterbunt.calculator.actions.SubstractionAction;
import java.util.Scanner;

/**
 * Takes arguments and calculates things based on these arguments.
 * Can do substractions and additions.
 */
public class App {

    public static final String ADD = "add";
    public static final String MINUS = "minus";
    public static final String MULTIPLY = "multiply";
    public static final String EXIT = "exit";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //              Reference name
        //  Reference Type  |
        //  v               v
        AdditionAction additionAction = new AdditionAction();
        SubstractionAction substractionAction = new SubstractionAction();
        MultiplyAction multiplyAction = new MultiplyAction();
        Calculator calc = new Calculator();

        while (true) {
            System.out.println("What do you want to do? [add, minus, exit]");
            String command = scanner.nextLine();

            if (EXIT.equals(command)) {
                new ExitAction().exit();
            }

            int zahl1 = readNumber(scanner, "Give me the first number: ");
            int zahl2 = readNumber(scanner, "Give me the second number: ");

            if (ADD.equals(command)) {
                additionAction.addition(zahl1, zahl2);
            } else if (MINUS.equals(command)) {
                substractionAction.substraction(calc, zahl1, zahl2);
            } else if (MULTIPLY.equals(command)) {
                multiplyAction.multiplication(calc, zahl1, zahl2);
            }
        }
    }

    public static int readNumber(Scanner scanner, String text) {
        System.out.println(text);
        String line = scanner.nextLine();
        return Integer.parseInt(line);
    }


}
