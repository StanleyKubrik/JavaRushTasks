/*
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
3. Переставить M первых строк в конец списка.
4. Выведи список на экран, каждое значение с новой строки.
 */
package level7;

import java.io.*;
import java.util.*;

public class task160_lev7_lec12 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++){
            stringArrayList.add(i, reader.readLine());
        }

        for (int i = 0; i < m; i++){
            stringArrayList.add(stringArrayList.get(0));
            stringArrayList.remove(0);
        }

        for (int i = 0; i < stringArrayList.size(); i++){
            System.out.println(stringArrayList.get(i));
        }
    }
}
