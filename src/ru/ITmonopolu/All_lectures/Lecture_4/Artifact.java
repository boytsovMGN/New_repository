package ru.ITmonopolu.All_lectures.Lecture_4;

public class Artifact {

    int num;
    String stock;
    int century;


    public Artifact(int num){
        this.num=num;
    }
    public Artifact(int num, String stock){
        this.num=num;
        this.stock=stock;
    }
    public Artifact(int num, String  stock, int century){
        this.num=num;
        this.stock=stock;
        this.century=century;
    }
    public static void main(String[] args) {
        Artifact mumiy1=new Artifact(12);
        System.out.println(mumiy1.num+"век");

        Artifact mumiy2=new Artifact(12,"FAC");
        System.out.println(mumiy2.num + mumiy2.stock);
    }
}
