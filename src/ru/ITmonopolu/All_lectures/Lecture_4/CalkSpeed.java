package ru.ITmonopolu.All_lectures.Lecture_4;
import java.util.Scanner;
public class CalkSpeed {
    public static void main(String[] args) {
        System.out.println("Введите растояние в км ");
        Scanner length=new Scanner(System.in);
        float Length=length.nextFloat();
        System.out.println("Введите время в часах ");
        Scanner time=new Scanner(System.in);
        int Time=time.nextInt();

        float speed=0;
        speed=Length/Time;
        System.out.println("Необходимая скорость "+speed+" км/ч");
    }
}
