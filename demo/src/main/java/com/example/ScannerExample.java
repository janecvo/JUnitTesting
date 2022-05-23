package com.example;
import java.util.Scanner;

public class ScannerExample {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        printString1();
        printString2();
        printString3();
    }

        public static String printString1(){
            System.out.println("Enter a string of text: ");
            String text1 = scanner.nextLine();
            return "You wrote " +text1;
        }

        public static String printString2(){
            System.out.println("Enter a second string of text: ");
            String text2 = scanner.nextLine();
            return "You wrote " +text2;
        }

        public static String printString3(){
            System.out.println("Enter a third string of text: ");
            String text3 = scanner.nextLine();
            return "You wrote " +text3;
        }

    }
        
        // System.out.println("Provide first string of text:");
        // String one = scanner.nextLine();
        // System.out.println("Provide second string of text:");
        // String two = scanner.nextLine();
        // System.out.println("Provide third string of text:");
        // String three = scanner.nextLine();

    //     System.out.println("You wrote:");
    //     System.out.println(one);
    //     System.out.println(two);
    //     System.out.println(three);
    // }