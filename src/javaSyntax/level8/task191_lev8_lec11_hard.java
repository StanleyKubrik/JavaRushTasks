/*
Омовение Рамы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.


Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать строку с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна заменять в тексте первые буквы всех слов на заглавные.
 */
package javaSyntax.level8;

import java.io.*;

public class task191_lev8_lec11_hard {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String[] part = s.trim().split("\\s+");

        for (String word : part){
            String v = word.substring(0, 1);
            System.out.print(v.toUpperCase() + word.substring(1)+ " ");
        }
    }
}
