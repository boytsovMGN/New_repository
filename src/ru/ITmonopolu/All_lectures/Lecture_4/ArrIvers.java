package ru.ITmonopolu.All_lectures.Lecture_4;
import java.util.Random;
public class ArrIvers {
    public static void main(String[] args) {
        int arrI=10;
        int arrJ=10;
        int[][] arr=new int[arrI][arrJ];
        Random r=new Random();

        for (int i=0;i<arr.length;++i){
            for (int j=0;j<arr[i].length;++j){
                arr[i][j]=r.nextInt(arrI*arrJ);
                System.out.print(" arr["+i+"]["+j+"]= "+arr[i][j]);
            }
            System.out.println(" ");
        }

        int[][] newArr=new int[arrJ][arrI];

        for (int i=0;i<arr.length;++i){
               for (int j=0;j<arr[i].length;++j){
                   newArr[j][i]=arr[i][j];

               }

        }
        for (int i=0;i<newArr.length;++i){
            for (int j=0;j<newArr[i].length;++j){
                System.out.print(" newArr["+i+"]["+j+"]= "+newArr[i][j]);
            }
            System.out.println(" ");
        }


    }
}
