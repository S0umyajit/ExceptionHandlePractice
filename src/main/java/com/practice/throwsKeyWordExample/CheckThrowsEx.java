package com.practice.throwsKeyWordExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite{

    public void readFile() throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("d:/abx.txt");
    }
    public void saveFile() throws FileNotFoundException {
        FileOutputStream fos=new FileOutputStream("d:/abx.txt");
    }
}

public class CheckThrowsEx {
    public static void main(String[] args) {
        ReadAndWrite rw=new ReadAndWrite();
        try {
            rw.readFile();
        }catch(Exception e){
            System.out.println(e);
        }
        try {
            rw.saveFile();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Hello");
    }
}
