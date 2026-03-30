package com.practice;

public class ExceptionPrac {
    public static void main(String[] args) {
        int a=10,b=0,c;
        try {
            c = a / b;
            System.out.println(c);
        }catch (ArithmeticExcepion ae){
            ae.printStackTrace();
//            System.out.println(ae);
//            System.out.println(ae.getMessage());
//            System.out.println(ae.toString());
        }
        System.out.println("hello");

    }
}
