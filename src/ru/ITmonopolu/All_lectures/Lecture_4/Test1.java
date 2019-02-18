package ru.ITmonopolu.All_lectures.Lecture_4;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {



            Scanner sc = new Scanner(System.in);
            int x = 0;
            //Ввод
            System.out.print("Введите целое число: ");
            if (sc.hasNextInt()) {
                x = sc.nextInt();
            } else {
                System.out.println("Это не целое число!");
                return;
            }

            int[] digits = numberToArray(x);
            int maxVal=0;
            for (int i=0;i<digits.length;++i){
                if (maxVal<digits[i]){
                    maxVal=digits[i];
                }
            }

            for (int line = 0; line < 7; line++) {
                for (int j = 0; j < digits.length; j++) {
                    if(maxVal==digits[j]){
                        System.out.print(viewNum[line][digits[j]]);
                    } else {
                        System.out.print(view[line][digits[j]]);
                    }
                }
                System.out.println();
            }

    }

    private static int[] numberToArray(int x) {
        //Решение
        char[] array1 = Integer.toString(x).toCharArray();
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = Character.getNumericValue(array1[i]);
        }
        return array2;
    }

    private static final String[][] view = {

            {"  ***  ", "   *   ", "  ***  ", "  ***  ", "    *  ", " ***** ", "  ***  ", " ***** ", "  ***  ", "  ***  "},
            {" *   * ", "  **   ", " *   * ", " *   * ", "   **  ", " *     ", " *   * ", "     * ", " *   * ", " *   * "},
            {"*     *", " * *   ", " *   * ", "     * ", "  * *  ", " *     ", " *     ", "    *  ", " *   * ", " *   * "},
            {"*     *", "   *   ", "    *  ", "  ***  ", " *  *  ", " ****  ", " ****  ", "   *   ", "  ***  ", "  ***  "},
            {"*     *", "   *   ", "   *   ", "     * ", " ***** ", "     * ", " *   * ", "  *    ", " *   * ", "     * "},
            {" *   * ", "   *   ", "  *    ", " *   * ", "    *  ", " *   * ", " *   * ", "  *    ", " *   * ", "     * "},
            {"  ***  ", " ***** ", " ***** ", "  ***  ", "    *  ", "  ***  ", "  ***  ", "  *    ", "  ***  ", "  ***  "}
    };

    private static final String[][] viewNum = {

            {"  000  ", "   1   ", "  222  ", "  333  ", "    4  ", " 55555 ", "  666  ", " 77777 ", "  888  ", "  999  "},
            {" 0   0 ", "  11   ", " 2   2 ", " 3   3 ", "   44  ", " 5     ", " 6   6 ", "     7 ", " 8   8 ", " 9   9 "},
            {"0     0", " 1 1   ", " 2   2 ", "     3 ", "  4 4  ", " 5     ", " 6     ", "    7  ", " 8   8 ", " 9   9 "},
            {"0     0", "   1   ", "    2  ", "  333  ", " 4  4  ", " 5555  ", " 6666  ", "   7   ", "  888  ", "  999  "},
            {"0     0", "   1   ", "   2   ", "     3 ", " 44444 ", "     5 ", " 6   6 ", "  7    ", " 8   8 ", "     9 "},
            {" 0   0 ", "   1   ", "  2    ", " 3   3 ", "    4  ", " 5   5 ", " 6   6 ", "  7    ", " 8   8 ", "     9 "},
            {"  000  ", " 11111 ", " 22222 ", "  333  ", "    4  ", "  555  ", "  666  ", "  7    ", "  888  ", "  999  "}
    };


}
