/*
Исправляем ошибки юности
Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде "Max is 25".


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить результат на экран.
3. Текст выведенный на экран должен начинаться с «Max is».
4. Текст выведенный на экран должен заканчиваться максимумом из 2х введенных чисел.
 */
package javaSyntax.level6;

import java.io.*;

public class task138_lev6_lec11 {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int max = a > b ? a : b;

        System.out.println("Max is "+ max);
    }
}
