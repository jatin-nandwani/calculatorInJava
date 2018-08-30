package com.sharpkits;

import java.util.Scanner;

public class Calculator {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        String continueOperation = "Y";
        while(continueOperation.equals("Y") || continueOperation.equals("y")) {
            System.out.println("Please enter the operation you want to perform");
            System.out.println("You can add, subtract, multiply, divide");
            System.out.println("Please enter the first number");
            int firstNumber = userInput.nextInt();
            System.out.println("Please enter the second number");
            int secondNumber = userInput.nextInt();
            System.out.println("Please enter the operation to perform");
            String operationEntered = userInput.next();

            if(userInput.hasNextLine()) {
                switch (operationEntered) {
                    case "+":
                        int sum = firstNumber + secondNumber;
                        System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
                        break;
                    case "-":
                        int subtraction = firstNumber - secondNumber;
                        System.out.println(firstNumber + " - " + secondNumber + " is " + subtraction);
                        break;
                    case "*":
                        int multiplication = firstNumber * secondNumber;
                        System.out.println(firstNumber + " * " + secondNumber + " is " + multiplication);
                        break;
                    case "/":
                        int division = firstNumber / secondNumber;
                        System.out.println(firstNumber + " / " + secondNumber + " is " + division);
                        break;
                    default:
                        System.out.println("Please enter a valid operation");
                        break;
                }
            }
            System.out.println("Do you want to continue Y/N");
            continueOperation = userInput.next();
            continueOperation = continueOperation.toUpperCase();
            boolean checkInput = (continueOperation.equals("Y") || continueOperation.equals("N")) ? true : false;
            if(!checkInput) {
                System.out.println("Please enter either Y or N");
                continueOperation = userInput.next();
            }
            if(continueOperation.equals("N")) {
                System.out.println("Live long and prosper :)");
            }
        }
    }
}
