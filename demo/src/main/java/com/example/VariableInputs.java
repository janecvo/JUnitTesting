package com.example;
import java.util.Scanner;

public class VariableInputs {
    public static Scanner scanner = new Scanner(System.in);
    public static void main  (String[] args){
        printString();
        printInt();
        printDouble();
        printBoolean();
    }

    public static String printString(){
        System.out.println("Enter a string of text: ");
        String text = scanner.nextLine();
        return "Your string is " + text;
    }

    public static String printInt(){
        System.out.println("Enter an integer: ");
        int number = Integer.valueOf(scanner.nextLine());
        return "Your integer is " + number;
    }

    public static String printDouble(){
        System.out.println("Enter a double: ");
        double decimal = Double.valueOf(scanner.nextLine());
        return "Your double is " + decimal;
    }

    public static String printBoolean(){
        System.out.println("Enter a boolean value: ");
        boolean trueOrFalse =  Boolean.valueOf(scanner.nextLine());
        return "Your boolean is " + trueOrFalse;
    }
}
