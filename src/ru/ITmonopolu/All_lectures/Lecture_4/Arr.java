package ru.ITmonopolu.All_lectures.Lecture_4;

import java.util.Random;
import java.util.Scanner;


public class Arr<arrlength> {
    public static void main(String[] args) {
        Random randomVar = new Random();
        System.out.println("Введиде размер массива");
        Scanner scannerint = new Scanner(System.in);
        int arrlength = scannerint.nextInt(); //length arr

        int[] arr = new int[arrlength];
        int il=arr.length;
        for (int i = 0; i < arrlength; ++i) {
            arr[i] = randomVar.nextInt(arrlength);
        }

        int newArrLength = arrlength / 3;
        System.out.println("Введиде " + newArrLength + " чисел");
        int[] newArr = new int[newArrLength];
        for (int i = 0; i < newArrLength; ++i) {
            newArr[i] = scannerint.nextInt(); //length arr
        }
        int complitResult = 0;
        for (int i = 0; i < arrlength; ++i) {
            for (int ii = 0; ii < newArrLength; ++ii) {
                if (newArr[ii] == arr[i]) {
                    System.out.println("Совпавшее число " + arr[i]);
                    ++complitResult;
                    ii=newArrLength;
                }
            }
        }
        int i2 = 0;
        for (int i = 0; i < arrlength; ++i) {

            System.out.print("arr[" + i + "]=" + arr[i] + " ");
            ++i2;
            if (i2 == 3) {
                i2=0;
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("Число совпадений " + complitResult);
    }

}
