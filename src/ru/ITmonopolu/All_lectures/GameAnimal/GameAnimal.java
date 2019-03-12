package ru.ITmonopolu.All_lectures.GameAnimal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class GameAnimal {
    static Animal first;

    public static void main(String[] args) throws Throwable {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> allAnimal = new HashMap<>();
        ArrayList<String> keysVoice = new ArrayList<String>();
        Animal animal = new Animal();
        animal.name = "собака";
        animal.voice = "гавкает";
        Boolean flag1 = true;


        int count = 0;

        keysVoice.add(animal.voice);
        allAnimal.put(keysVoice.get(count), animal.name);

        while (true) {
            flag1 = true;
            for (int i = 0; i < allAnimal.size() && flag1; i++) {
                if (Methods.answerVoice(keysVoice.get(i))) {
                    if (Methods.answerName(allAnimal.get(keysVoice.get(i)))) {
                        System.out.println("VIN");
                        flag1 = false;
                    }
                } else {
                    flag1=true;
                }
            }
            if(flag1) {
                System.out.println("Сдаюсь! Кто это?");
                count++;
                System.out.println("Введите название животного:");
                String name = reader.readLine();
                animal.name = name;
                System.out.println("Введите чем оно отличается от остальных:");
                String voice = reader.readLine();
                animal.voice = voice;
            }
            keysVoice.add(animal.voice);
            allAnimal.put(keysVoice.get(count), animal.name);
            System.out.println("Съиграем еще???");
            if (!Methods.question_YN()) {
                break;
            }
        }

        System.out.println("GAME OVER");
    }
}
