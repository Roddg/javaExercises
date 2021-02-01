/*Сортировка пузырьком, while, for, if, Сортировка трех чисел от JavaRush 4 уровень 6 лекция
Задание от JavaRush
Сортировка трех чисел, на вход подается 5, 4, 7
Упорядочим три введенные с клавиатуры числа
по убыванию, а затем выведем их на экран. Выведенные числа должны быть разделены
пробелом.
*/
package Sorted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSorted {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));// Мы создаем объект класса
        // InputStreamReader и передаем ему входящий поток, из которого он должен считывать данные, поток для получения данных с клавиатуры

        int i1 = Integer.parseInt(reader.readLine());//получение примитивного типа данных определенной строки,
        // другими словами — преобразуем строку в число, читаем данные целыми строками
        int i2 = Integer.parseInt(reader.readLine());
        int i3 = Integer.parseInt(reader.readLine());

        int temp;//мы создали переменную temp, которая нам пригодится при обмене.
        boolean sorted = false;//создали переменную sorted, которая будет таким себе флажком того, отсортирован ли уже массив или нет.
        int[] numbers = {i1, i2, i3};//запишем полученные с клавиатуры данные в массив
        while (!sorted) { //далее создали цикл, который будет делать проход за проходом. Так, как мы не знаем,
            // сколько циклов нужно сделать, то использовали цикл while.
            sorted = true; //первым действием в цикле будет установка значения в true,
            // то есть изначально мы предполагаем, что массив отсортирован.
            for (int i = 0; i < numbers.length - 1; i++) { //А дальше нам нужно попарно сравнить все элементы массива.
                // Соответственно, нам нужно использовать еще один цикл внутри внешнего.
                //В этом случае мы точно знаем, сколько итераций будет, поэтому используем цикл for.
                // Обратите внимание, что правая граница не на numbers.length, а numbers.length – 1,
                // поскольку мы сравниваем i-й и i+1-й элементы, и чтобы мы не вышли за пределы массива,
                // делаем на 1 цикл меньше.

                //В цикле for проверяем, больше ли i-й элемент, чем элемент i+1
                if (numbers[i] < numbers[i + 1]) {// Если да, то устанавливаем флажек
                    // отсортированости в false(есть обмен, поэтому массив все еще не отсортирован)
                    temp = numbers[i];//далее делаем обмен через созданную ранее переменную temp.
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    sorted = false;
                }
            }
        }//Таким образом, цикл while будет работать, пока переменная sorted будет в положении false
        // на момент окончания попарной проверки.
         //А это возможно только при отсутствии ситуаций, когда numbers[i] < numbers[i + 1],
        // то есть при отсутствии обменов.

        for (int i : numbers){//выведем все числа на экран с помощью цикла
            System.out.println(i + " ");//разделим их пробелами
        }
    }
}

/*Как работает сортировка пузырьком?

Сортировка пузырьком заключается в следующем:

начиная с начала массива просматриваем попарно по 2 элемента
(первый со вторым, второй с третим, третий с четвертым и т.д.).
Если второй элемент в паре меньше первого элемента – перемещаем его на место первого, а первый на место второго.
Это мы делаем для всех элементов.
После того, как мы дошли до конца массива (сравнили предпоследний и последний элементы и сделали обмен, если нужно),
проверяем, был ли хотя бы один обмен. Если да, значит массив не отсортирован и начинаем все сначала.
Повторяем такие проходы, пока не будет так, что мы проверили попарно все элементы от начала до конца,
а обмена ни одного не было.
Таким образом элементы с самыми маленькими значениями потихоньку перемещаются справа налево.
То есть они как будто всплывают, как мыльный пузырь. Отсюда и название метода – пузырьком.*/