package com.jason.java;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class HelloWorld {
    public static final int num = 2;

    public static void main(String[] args) {
        System.out.println("helloworld");


        ArrayList list = new ArrayList();
        list.add(0, 123);

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.printf("");
        System.out.println();
        System.out.println();
        System.out.println("list = " + list);
        System.out.println("HelloWorld.main");
        System.out.println("args = [" + args + "]");

    }

    /**
     * 方法注释
     * haha
     */
    public void save() {
        System.out.println("");
        System.out.println("HelloWorld.save");
        System.out.println("true = " + true);
       int num= 10;
        System.out.println(num);
        System.out.println("num = " + num);
        for (Object o : ) {
            
        }
    }

    public void test1(){

    }

}

