package com.example;

public class MethodReturnType {
    public static void main (String[] args){
        String string = returnStr();
        System.out.println(string);
        int num = returnNum();
        System.out.println(num);
        boolean bool = returnBoolean();
        System.out.println(bool);
    }
    public static String returnStr(){
        return "String of text";
    }
    public static int returnNum(){
        return 5;   
    }
    public static boolean returnBoolean(){
        return false;
    }
}
