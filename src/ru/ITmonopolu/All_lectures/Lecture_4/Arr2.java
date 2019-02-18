package ru.ITmonopolu.All_lectures.Lecture_4;
import java.util.Random;
public class Arr2 {
    public static void main(String[] args) {
        Random r=new Random();
        int iArr=100;
        int jArr=10;
        int[][] arr=new int[iArr][jArr];

        for (int i=0;i<arr.length;++i){
            for (int j=0;j<arr[i].length;++j){
                arr[i][j]=r.nextInt(iArr*jArr);
            }
        }
        for (int i=0;i<arr.length;++i){
            System.out.println(" ");
            for (int j=0;j<arr[i].length;++j){
                System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+" ");
            }
        }
        System.out.println(" ");
        int i2=0;
        int[] arrLine=new int[iArr*jArr];
        for (int i=0;i<arr.length;++i){
            for (int j=0;j<arr[i].length;++j){

                if(i2%10==0){
                    System.out.println(" ");
                }
                arrLine[i2]=arr[i][j];
                System.out.print("arrLine["+i2+"]="+arrLine[i2]+" ");
                ++i2;
            }
        }
    }
}
