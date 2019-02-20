package ru.ITmonopolu.All_lectures.Lecture_10;

import ru.ITmonopolu.All_lectures.Lecture_9.Dog;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LincList {
    public static void YN(){
        System.out.println("Для продолжения/завершения введите y/n");
    }

    public static void f(int x, ArrayList list) {
        x=2000;
        int y=20;
        System.out.println("y=" +y);
        list.add("abc");
        System.out.println("list=" +list);
    }
    public static void main(String[] args) {

        List list=new ArrayList();
        Scanner s=new Scanner(System.in);
        YN();
        String answer=s.next();
        while (answer.equals("y")){
            System.out.println("Введите имя собаки:");
            Dog d=new Dog();
            d.name=s.next();
            list.add(d);
            YN();
            answer=s.next();
        }
        int a=14;
        int y=666;
        f(a,(ArrayList) list);

        System.out.println("y=" +y);
        System.out.println("list=" +list);

    }

}
