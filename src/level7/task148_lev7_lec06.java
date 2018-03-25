/*
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.


Требования:
1. Инициализируй существующее поле strings класса Solution новым ArrayList<>
2. Программа должна считывать 5 строк с клавиатуры и записывать их в список strings.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
 */
package level7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class task148_lev7_lec06 {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++){
            strings.add(i, reader.readLine());
        }

        int max = strings.get(0).length();
        for (int x = 0; x < 5; x++){
            if (strings.get(x).length() > max){
                max = strings.get(x).length();
            }
        }

        for (int y = 0; y < 5; y++){
            if (strings.get(y).length() == max) System.out.println(strings.get(y));
        }
    }
}
