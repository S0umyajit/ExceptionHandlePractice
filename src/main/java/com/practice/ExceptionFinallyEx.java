package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionFinallyEx {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try{
            fis=new FileInputStream("d:/abc.txt");
        }catch (FileNotFoundException e){
            System.out.println(e.toString());
        }
        finally {
            if(fis!=null){
                try {
                    fis.close();
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("connection closed");
        }
    }
}
