package ru.ITmonopolu.All_lectures.GameAnimal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class  Methods {
    public static boolean answerVoice (String voice) throws Throwable {
        System.out.println("Ваше животное "+voice+"?");
        return question_YN();
    }
    public static boolean answerName (String name) throws Throwable {
        System.out.println("Это "+name+"?");
        return question_YN();
    }
    public static Boolean question_YN()throws Throwable{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String question;
        while (true) {
            System.out.println("Введите y/n");
            question=reader.readLine();
            if (question.equals("y")) {
                return true;
            } else if (question.equals("n")) {
                return false;
            }
        }
    }
}
