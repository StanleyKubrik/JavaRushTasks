/*
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
 */
package level7;

import java.util.*;
import java.io.*;

public class task152_lev7_lec06 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            stringArrayList.add(i, reader.readLine());
        }

        int min = stringArrayList.get(0).length();
        for (int x = 0; x < 10; x++) {
            if (stringArrayList.get(x).length() < min)
                min = stringArrayList.get(x).length();
        }

        int max = stringArrayList.get(0).length();
        for (int x = 0; x < 10; x++) {
            if (stringArrayList.get(x).length() > max)
                max = stringArrayList.get(x).length();
        }

        for (int y = 0; y < 10; y++){
            if (stringArrayList.get(y).length() == max) {
                System.out.println(stringArrayList.get(y));
                break;
            }
            if (stringArrayList.get(y).length() == min){
                System.out.println(stringArrayList.get(y));
                break;
            }
        }
    }
}
