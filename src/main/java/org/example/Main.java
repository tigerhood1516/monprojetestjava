package org.example;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println("La somme de deux entiers");
        int a = 6, b = 7;
        simpleCalculator calculator = new simpleCalculator();

        System.out.println("La somme est : "+calculator.addition(a, b));
        System.out.println("La difference est : "+calculator.soustraction(a, b));
        System.out.println("La multiplication est : "+calculator.multiplication(a, b));
        boolean test = calculator.isEven(4);
        System.out.println(test);

        RegistrationUtil infoUser = new RegistrationUtil();
        boolean result = infoUser.validateUserInput("tigerhood", "azerty", "azerty");
        System.out.println(result);
    }
}