package com.practice.com.practice2;

import java.util.Scanner;

class UnderAgeException extends Exception{

    UnderAgeException(){
        super("You are under Age");
    }
    //This is how user can provide his own message.
    //super keyword is to provide details to defualt exception handler
    UnderAgeException(String msg){
        super(msg);
    }

}

public class MyException {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age=sc.nextInt();
        try{
        if(age<18) {
            throw new UnderAgeException("You can vote cause your age is: "+age +", you have to be 18 to vote. Now fuck off");
        }
        }catch (UnderAgeException e){
            e.printStackTrace();
        }
        System.out.println("This is the end");

    }
}
