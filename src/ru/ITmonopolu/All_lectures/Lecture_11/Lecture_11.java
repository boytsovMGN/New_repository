package ru.ITmonopolu.All_lectures.Lecture_11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lecture_11 {
    public static void main(String[] args) {

        try {
            f(1);
        } catch (ArithmeticException ex) {
            System.out.println("Арифметическая ошибка");
        }
        catch (NullPointerException ex) {
            System.out.println("Арифметическая ошибка");
        }
        System.out.println("Program end");
        g(1);
    }

    public static void f(int a) {
        System.out.println("f0");
        int b = 1 / a;
//        File file = new File("");
//        try {
//            FileInputStream fis = new FileInputStream(file);
//        } catch (FileNotFoundException e){
//            System.out.println("Not found file!!!");
//        }
        System.out.println("Functions end");
    }
    //g!=1
    public static void g(int i){
        if (i==1){
            throw new MyException("Fatal");
        }

    }
}
