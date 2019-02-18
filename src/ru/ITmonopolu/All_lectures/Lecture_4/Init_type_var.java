package ru.ITmonopolu.All_lectures.Lecture_4;

import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;


public class Init_type_var {
    public static void main(String[] args) {

//        Scanner inputVar=new Scanner(System.in);
//        System.out.println("Введите информацию ");
//        if (inputVar.hasNextInt()){
//            int var=inputVar.nextInt();
//            System.out.println("У введенной информации тип INT "+var);
//        } else if (inputVar.hasNextFloat()){
//            float var=inputVar.nextFloat();
//            System.out.println("У введенной информации тип FLOAT "+var);
//        } else if (inputVar.hasNext()){
//            int var=inputVar.nextInt();
//            System.out.println("У введенной информации тип STRING "+var);
//        }
//    }


//        char b;
////
////        System.out.println("Программа ожидает ввода: ");
////
////        b = (char) System.in.read();
////
////        if (b >= 'A' & b <= 'Z' || b >= 'a' & b <= 'z') {
////
////            System.out.println("Вы ввели символ");
////
////        } else if (b >= '0' & b <= '9') {
////
////            System.out.println("Вы ввели число");
////
////        } else if (b >= '!' & b < '"' || b >= '(' & b <= ')' || b >= ':' & b <= ';' || b >= ',' & b <= '.') {
////
////            System.out.println("Вы ввели знак пунктуации");
////
////        } else {
////            System.out.println("Вы ввели не символ, не число и не знак пунктуации");
////        }
////    }




                int counter, num, array[];

                //Создаем объект Scanner для считывания чисел, введенных пользователем
                Scanner input = new Scanner(System.in);
                System.out.println("Введите количество элементов массива: ");
                num = input.nextInt();

                // Создаем массив введенного пользователем размера
                array = new int[num];

                System.out.println("Введите " + num + " чисел");

                //Заполняем массив, вводя элементы в консоль
                for (counter = 0; counter < num; counter++) {
                    array[counter] = input.nextInt();
                }

                // печатаем массив перед пузырьковой сортировкой
                System.out.println("массив перед пузырьковой сортировкой : " + Arrays.toString(array));

                // сортируем массив
                bubbleSort(array);

                // печатаем массив после пузырьковой сортировки
                System.out.println("массив после пузырьковой сортировки : " + Arrays.toString(array));
            }

            // метод пузырьковой сортировки
            public static void bubbleSort(int[] num) {
                int j;
                boolean flag = true;   // устанавливаем наш флаг в true для первого прохода по массиву
                int temp;   // вспомогательная переменная

                while (flag) {
                    flag = false;    // устанавливаем флаг в false в ожидании возможного свопа (замены местами)
                    for (j = 0; j < num.length - 1; j++) {
                        if (num[j] > num[j + 1]) { // измените на > для сортировки по возрастанию
                            temp = num[j];         // меняем элементы местами
                            num[j] = num[j + 1];
                            num[j + 1] = temp;
                            flag = true;  // true означает, что замена местами была проведена
                        }
                    }
                }
            }
        }




