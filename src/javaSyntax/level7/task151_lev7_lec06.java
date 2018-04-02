/*
Удалить и вставить
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Программа должна выводить список на экран, каждое значение с новой строки.
 */
package javaSyntax.level7;

import java.io.*;
import java.util.*;

public class task151_lev7_lec06 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            stringArrayList.add(i, reader.readLine());
        }

        for (int x = 0; x < 13; x++){
            String s = stringArrayList.get(4);
            stringArrayList.remove(4);
            stringArrayList.add(0, s);
        }

        for (int y = 0; y < 5; y++){
            System.out.println(stringArrayList.get(y));
        }
    }
}
