package Startjava.Lesson_1;

import java.util.Random;

public class Unicode {
    public static void main(String[] args) {
        Random rand_char = new Random();
        int number = 10178;
        int unicode = rand_char.nextInt(number) + 9398;
        char smile = (char)(unicode);
        System.out.println(unicode);
        System.out.println(smile);
    }

}
