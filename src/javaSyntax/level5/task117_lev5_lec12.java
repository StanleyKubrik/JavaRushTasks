/*
Задача по алгоритмам
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.


Требования:
1. Программа должна считывать числа с клавиатуры.
2. В классе должен быть метод public static void main.
3. Нельзя добавлять новые методы в класс Solution.
4. Программа должна выводить на экран максимальное из введенных N чисел.
 */
package javaSyntax.level5;

import java.io.*;

public class task117_lev5_lec12 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int dig = Integer.parseInt(reader.readLine());

        for (int a = 1; a <= dig; a++){
            int n = Integer.parseInt(reader.readLine());
            if (n > maximum){
                maximum = n;
            }
        }
        System.out.println(maximum);
    }
}
