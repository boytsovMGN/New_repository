package ru.ITmonopolu.All_lectures.Lecture_9;

public final class Dog extends Animal{
    public final static int LEGS_COUNT=4;    //переменная в классе

    public String name;
    @Override
    public void say(){
        System.out.println(name+": гав");
    }
    public void info(){
        System.out.println("ног: "+LEGS_COUNT+ " Имя:" +name);
    }

    @Override
    public String toString() {
        return "Собака "+name;
    }
}
//