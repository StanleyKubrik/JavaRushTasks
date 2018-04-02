/*
Минимаксы в массивах
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.


Требования:
1. Создай массив целых чисел (int[]) на 20 элементов.
2. Считай с клавиатуры 20 целых чисел и добавь их в массив.
3. Найди и выведи через пробел максимальное и минимальное числа.
4. Используй цикл for.
 */
package javaSyntax.level7;

import java.io.*;

public class task161_lev7_lec12 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[20];

        for (int i = 0; i < 20; i++){
            numbers[i] = Integer.valueOf(reader.readLine());
        }

        int minimum = numbers[0];
        int maximum = numbers[0];

        for (int i = 0; i < 20; i++){
            if (numbers[i] < minimum)
                minimum = numbers[i];
        }

        for (int i = 0; i < 20; i++){
            if (numbers[i] > maximum)
                maximum = numbers[i];
        }

        System.out.println(maximum + " " + minimum);
    }
}
