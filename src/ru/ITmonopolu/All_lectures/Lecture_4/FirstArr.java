package ru.ITmonopolu.All_lectures.Lecture_4;

public class FirstArr {
    public static void main(String[] args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 200, 388, 275, 243, 334, 412, 393, 299, 343, 317, 100};

        int myfirst = First(times);
        outMSG("Привет");
        System.out.println(names[myfirst]+times[myfirst]);
        outMSG("Пока");

    }
    public static int First(int[] array) {
        int num = array[0];
        int ind = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < num) {
                num = array[i];
                ind = i;
            }
        }
        return ind;
    }

    public static void outMSG(String message) {
        System.out.println("Это сообщение"+message);

    }
}
