/*
Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке. Каждый элемент - с новой строки.
Использовать только цикл for.


Требования:
1. Объяви переменную типа список целых чисел и сразу проинициализируй ee.
2. Считай 10 целых чисел с клавиатуры и добавь их в список.
3. Выведи числа в обратном порядке.
4. Используй цикл for.
 */
package level7;

import java.io.*;
import java.util.*;

public class task159_lev7_lec12 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            integers.add(i, Integer.valueOf(reader.readLine()));
        }

        for (int i = 9; i >= 0; i--){
            System.out.println(integers.get(i));
        }
    }
}
