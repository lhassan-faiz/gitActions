package com.testgithub;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Example calculations
        int sum = calculator.add(5, 3);
        int difference = calculator.subtract(10, 4);
        int product = calculator.multiply(6, 7);
        double quotient = calculator.divide(8, 2);

        // Display results
        System.out.println("Sum: bbb " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("after modified");

    }
}
