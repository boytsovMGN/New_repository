package ru.ITmonopolu.All_lectures.Lecture_9;

import ru.ITmonopolu.All_lectures.Main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static final int DAY_IN_YEAR=365;   //константа для всех методов
    public static void main(String[] args) {
/*   ДЗ
    создать linkedList
1-спросить у пользователя в цикле имя собаки
    добавить в лист
2-в еще одном цикле вывести всех собак

Set s=new HashSet();//в цикле добавить слова (String) от пользователя
вывести их на экран
Iterator iterator=s.iterator();
while(iterator.hasNext()){
    Object object=iterator.next();
    sout;}
for(String str:s)



*/

        Dog dog = new Dog();
        dog.name="dog";
        Dog dog1 = new Dog();
        dog1.name="dog1";
        Dog dog2 = new Dog();
        dog2.name="dog2";
        LinkedList <String> list=new LinkedList<String>();
        list.add(dog.name);
        list.add(dog1.name);
        list.add(dog2.name);

        System.out.println(list);

//        List a= new ArrayList();
//        a.add(dog);
//        Scanner sc = new Scanner(System.in);
//
//
//        for(int i=0;i<4;i++){
//           a.add(dog)= sc.next();
//            Dog dog=new Dog();
//        }
//
//        Dog dog1=new Dog();
//
//        dog1.name="Бобик";
//
//
//        Dog dog2=new Dog();
//        dog2.name="Тузик";
//
//        dog1.info();
//        dog2.info();
////        Dog.LEGS_COUNT=5;
//        dog1.name="Барбос";
//        dog1.info();
//        dog2.info();
//
//
//        List a= new ArrayList();
//
//
//        a.add(dog1);
//        a.add(dog2);
//        a.add(33);
//        a.add("akf");
//
//        Object x=a.get(0);
////        Dog xx=(Dog)x;
//        System.out.println(x);

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
