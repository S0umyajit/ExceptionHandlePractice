package com.practice.com.practice2;

import java.util.Scanner;

class UnderAgeException extends Exception{

    UnderAgeException(){
        super("You are under Age");
    }

}

public class MyException {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age=sc.nextInt();
        try{
        if(age<18) {
            throw new UnderAgeException();
        }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("This is the end");

    }
}
