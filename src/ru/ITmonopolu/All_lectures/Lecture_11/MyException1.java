package ru.ITmonopolu.All_lectures.Lecture_11;

public class MyException1 extends Exception{
    public int stringLength;
    public MyException1(String message, int stringLength){
        super(message);
        this.stringLength=stringLength;
    }

}
