package ru.ITmonopolu.All_lectures.Lecture_11;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        String s=nameIn();
        try {
            corLength(s);
        } catch (MyException1 g){
            System.out.println("g.stringLength "+g.stringLength);
            System.out.println(g.getMessage());
            //g.printStackTrace();
        }


        System.out.println("Имя: "+s);
    }

    public static String nameIn() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя:");
        String name = sc.nextLine();
        return name;
    }

    public static void corLength(String s) throws MyException1 {
        int arg=4;
        if (s.length() < arg) {
            MyException1 le = new MyException1("Имя должно содержать более "+arg+"-х символов", s.length());
            throw le;

        }

    }

}
