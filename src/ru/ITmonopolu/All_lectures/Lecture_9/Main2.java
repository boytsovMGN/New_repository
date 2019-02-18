package ru.ITmonopolu.All_lectures.Lecture_9;

import ru.ITmonopolu.All_lectures.Main;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static final int DAY_IN_YEAR=365;   //константа для всех методов
    public static void main(String[] args) {

        Dog dog1=new Dog();

        dog1.name="Бобик";


        Dog dog2=new Dog();
        dog2.name="Тузик";

        dog1.info();
        dog2.info();
//        Dog.LEGS_COUNT=5;
        dog1.name="Барбос";
        dog1.info();
        dog2.info();


        List a= new ArrayList();


        a.add(dog1);
        a.add(dog2);
        a.add(33);
        a.add("akf");

        Object x=a.get(0);
//        Dog xx=(Dog)x;
        System.out.println(x);

//        final Animal a1, a2;
//
//        a1=new Dog();
//        a2=new Cat();
//
//        final int x=1;//определено единажды, нельзя переопределять
////        x=2;
//        a1.say();
//        a2.say();
//
//        Cat a3;
//
////        a3=a1;
//
////        a3=(Cat)a1;
////        Dog a2=new Dog();
////        a2.x();
    }
}
