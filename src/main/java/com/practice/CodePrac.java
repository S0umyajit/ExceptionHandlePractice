package com.practice;

class Test123 extends Thread{
    Thread codePrac;
    Test123(Thread codePrac){
        this.codePrac=codePrac;
    }
    public void run(){
        try {
            codePrac.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("hello");
    }

}

public class CodePrac {
    public static void main(String[] args) throws InterruptedException {
        Thread codePrac=Thread.currentThread();
        Test123 t=new Test123(codePrac);
        t.start();
        System.out.println(t.currentThread().getName());
//        t.join();
        System.out.println("Bye");
    }
}
