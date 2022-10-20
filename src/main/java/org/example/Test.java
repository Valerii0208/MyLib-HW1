package org.example;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.plus(4, 8));
        System.out.println(calculator.minus(4, 8));
        System.out.println(calculator.division(4, 8));
        System.out.println(calculator.multiplication(4, 8));
    }
}
