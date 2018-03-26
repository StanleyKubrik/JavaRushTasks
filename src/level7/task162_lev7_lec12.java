/*
Это конец
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
Вывести строки на экран, каждую с новой строки.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считывай строки с клавиатуры и добавляй их в список, пока пользователь не введет строку "end".
3. Саму строку "end" не нужно добавлять в список.
4. Выведи список на экран, каждое значение с новой строки.
5. Используй цикл for.
 */
package level7;

import java.io.*;
import java.util.*;

public class task162_lev7_lec12 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        while (true){
            String s = reader.readLine();
            if (s.equals("end"))
                break;
            else strings.add(s);
        }

        for (String i:strings){
            System.out.println(i);
        }
    }
}
