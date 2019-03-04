package ru.ITmonopolu.All_lectures.GameAnimal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class GameAnimal {
    static Animal first;

    public static void main(String[] args) {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        boolean flag=true;
        first=new Animal();
        first.name="собака";
        Animal a24;
        List  list=new LinkedList();
        System.out.println("Введите название животного:");
        while (flag){
            a24=new Animal();
            try {
                a24.name = reader.readLine();
                first.next = a24;
            } catch (Exception e){
                System.out.println("Неправильный ввод!!!");
            }

            if(a24.name.equals("no")){
                flag=false;
            } else {
                list.add(a24.name);
            }
        }
        System.out.println(list);
    }
}
