/*
Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв).
Закрыть потоки.


Требования:
1. Считывать с консоли ничего не нужно.
2. Создай поток чтения из файла, который приходит первым параметром в main.
3. В файле необходимо посчитать буквы английского алфавита и вывести это число в консоль.
4. Нужно учитывать заглавные и строчные буквы.
5. Поток чтения из файла должен быть закрыт.
 */
package javaCore.level18;

import java.io.*;

public class task441_lev18_lec11 {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream(args[0]);
        int count = 0;

        while (file.available() > 0){
            int b = file.read();
            if (b >= 'a' && b <= 'z' || b >= 'A' && b <= 'Z'){
                count++;
            }
        }
        file.close();
        System.out.println(count);
    }
}
