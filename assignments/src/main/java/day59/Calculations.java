package day59;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = Integer.valueOf( scanner.nextLine());
    
        System.out.println("Enter another number:");
        int num2 = Integer.valueOf(scanner.nextLine());
    }
        
    public static int addition(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static int subtract(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public static int multiply(int num1, int num2){
        int product = num1 * num2;
        return product;
    }

    public static double divide(int num1, int num2){
        double dividend = (double)num1/ num2;
        return dividend;
    }

    public static int modulus(int num1, int num2){
        int remainder = num1%num2;
        return remainder;
    }
}



        // int add = num1 + num2;
        // System.out.println(num1 + "+" +  num2  +"=" + add);
        // int sub = num1 - num2;
        // System.out.println(num1 + "-" +  num2  +"=" + sub);
        // int mult = num1 * num2;
        // System.out.println(num1 + "*" +  num2  +"=" + mult);
        // double div = (double)num1 /num2;
        // System.out.println(num1 + "/" +  num2  +"=" + div);
        // int mod = num1%num2;
        // System.out.println(num1 + "%" +  num2  +"=" + mod);