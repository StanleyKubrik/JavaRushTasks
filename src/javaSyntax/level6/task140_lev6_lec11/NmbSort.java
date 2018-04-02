/*
Числа по возрастанию
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

Пример ввода:
3
2
15
6
17

Пример вывода:
2
3
6
15
17


Требования:
1. Программа должна считывать 5 чисел с клавиатуры.
2. Программа должна выводить 5 чисел, каждое с новой строки.
3. Выведенные числа должны быть отсортированы по возрастанию.
4. Вывод должен содержать те же числа, что и были введены (порядок не важен).
 */
package javaSyntax.level6.task140_lev6_lec11;

import java.io.*;
import java.util.Arrays;

public class NmbSort {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] nmbArr = new int[5];
        for (int i = 0; i < nmbArr.length; i++) {
            nmbArr[i] = Integer.valueOf(reader.readLine());
        }

        System.out.println("До сортировки: " + Arrays.toString(nmbArr));

        int temp;
        for (int x = nmbArr.length - 1; x > 0; x--) {
            for (int i = 0; i < nmbArr.length - 1; i++) {
                if (nmbArr[i] > nmbArr[i + 1]) {
                    temp = nmbArr[i];
                    nmbArr[i] = nmbArr[i + 1];
                    nmbArr[i + 1] = temp;
                }
            }
        }
        System.out.println("После сортировки: " + Arrays.toString(nmbArr));
    }
}
