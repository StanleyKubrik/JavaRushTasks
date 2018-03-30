/*
Модернизация ПО
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:

Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи


Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать значения с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна вывести фамилию семьи по введенному городу.
 */
package level8;

import java.util.*;
import java.io.*;

public class task197_lev8_lec11 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> addresses = new ArrayList<>(); // создаём коллекцию город - семья
        while (true) {                              // поочерёдно вводим город и фамилию
            String tf = reader.readLine();
            if (tf.isEmpty()) break;                // если пустая строка - выход из цикла

            addresses.add(tf);                      // добавляем введённые строки в коллекцию
        }

        //read family town
        String town = reader.readLine();                    // вводим город
        for (int i = 0; i < addresses.size(); i++){
            if (addresses.get(i).equals(town)) {            // берём первый город и сверяем с введённым
                System.out.println(addresses.get(i + 1));   // если совпадает - выводим следующую строку, то есть
            } else {                                        // фамидию семьи
                i++;                                        // иначе перескакиваем через одну строку, то есть на
            }                                               // следующий город
        }
    }
}
