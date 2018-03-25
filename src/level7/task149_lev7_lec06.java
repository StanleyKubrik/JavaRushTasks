/*
Выражаемся покороче
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 5 строк с клавиатуры и записывать их в список.
3. Программа должна выводить самую короткую строку на экран.
4. Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.
 */
package level7;

import java.io.*;
import java.util.ArrayList;

public class task149_lev7_lec06 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            stringArrayList.add(i, reader.readLine());
        }

        int min = stringArrayList.get(0).length();
        for (int x = 0; x < 5; x++){
            if (stringArrayList.get(x).length() < min)
                min = stringArrayList.get(x).length();
        }

        for (int y = 0; y < 5; y++){
             if (stringArrayList.get(y).length() == min) System.out.println(stringArrayList.get(y));
        }
    }
}
