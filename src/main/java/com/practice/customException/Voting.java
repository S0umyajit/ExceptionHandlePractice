package com.practice.customException;

import java.util.Scanner;
//creating custom exception
//throw keyword mainly used for custom exception or user defined Exception
class YoungAgeException extends RuntimeException{
    YoungAgeException(String msg){
        super(msg);
    }
}
public class Voting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        if(age<18){
            throw new YoungAgeException("You are too young to vote");
        }
        else {
            System.out.println("You can vote");
        }
    }
}
