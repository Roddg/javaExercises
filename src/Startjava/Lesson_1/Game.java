//Напишите игру Угадай число:
//
//        компьютер "загадывает" целое число от (0 до 100], которое вам необходимо угадать
//        после каждой неудачной попытки выводите подсказку: System.out.println("Введенное вами число больше (меньше) того, что загадал компьютер")
//        если число угадано — System.out.println("Вы угадали!")
//        меняйте значение переменной, хранящей числа игрока, автоматически по какому-то простому алгоритму
//        (без применения ввода с клавиатуры или генерации рандомных чисел)
//        игра продолжается до тех пор, пока число не будет угадано

package Startjava.Lesson_1;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println(number);
        while (true) {
            System.out.println("Введите число: ");
            int input_number = input.nextInt();
            if (input_number < number) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else if (input_number > number) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                System.out.println("Вы угадали!");
                break;
            }
        }
    }
}
