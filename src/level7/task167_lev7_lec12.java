/*
Меняем функциональность
Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter). Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
Программа выводит содержимое нового списка на экран.

Пример ввода:
Кот
Коты
Я

Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна вывести столько же строк, сколько было введено.
3. Если в строке было четное число букв, то необходимо удвоить строку (как в примере).
4. Если в строке было нечетное число букв, то необходимо утроить строку (как в примере).
5. Программа должна прекращать считывать данные с клавиатуры как только пользователь введет пустую строку и нажмет Enter.
 */
package level7;

import java.io.*;
import java.util.*;

public class task167_lev7_lec12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() % 2 == 0) {
                newList.add(i, list.get(i) + " " + list.get(i));
            }
            else if (list.get(i).length() % 2 != 0){
                newList.add(i, list.get(i) + " " + list.get(i) + " " + list.get(i));
            }
        }

        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
    }
}
