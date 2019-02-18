package ru.ITmonopolu.All_lectures.Lecture_4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sorter_arr {


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Random randomVar = new Random();
        //System.out.println("Введиде размер массива");
        //Scanner scannerint = new Scanner(System.in);
        //int arrlength = scannerint.nextInt(); //length arr
        int arrlength=1000;
        int[] arr = new int[arrlength];
          for (int i = 0; i < arr.length; ++i) {
            arr[i] = randomVar.nextInt(arr.length);
        }


           // System.out.print(Arrays.toString(arr));

        System.out.println(" ");
        //Init_type_var.bubbleSort(arr);
        Sorter_arr(arr);


           //System.out.print(Arrays.toString(arr));

        System.out.println(" ");

        long timeSpent = System.currentTimeMillis()-startTime;

        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");
    }


    public static void Sorter_arr(int[] num) {
        int x;
        for (int i = 0; i < num.length; ++i) {
            int i1=1;
            for (int j=i; j<num.length-1;++j){
                if (num[i] > num[i+i1]) {
                    x=num[i];
                    num[i]=num[i+i1];
                    num[i+i1]=x;
                }
                i1++;

            }

        }
    }
}




