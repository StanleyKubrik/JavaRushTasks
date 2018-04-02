/*
Метод в try..catch
Написать программу, которая будет вводить числа с клавиатуры.
Код по чтению чисел с клавиатуры должен быть в методе readData.
Код внутри readData обернуть в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все ранее введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.


Требования:
1. Программа должна считывать данные с клавиатуры.
2. Метод main не изменять.
3. Метод main не должен кидать исключений.
4. Метод readData должен содержать блок try..catch.
5. Если пользователь ввел текст, а не число, программа должна вывести все ранее введенные числа.
 */
package level9.exception;

import java.util.*;
import java.io.*;

public class task219_lev9_lec11 {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> integers = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (true){
                integers.add(Integer.parseInt(reader.readLine()));
            }
        } catch (Exception e) {
            for (int i = 0; i < integers.size(); i++){
                System.out.println(integers.get(i));
            }
        }
    }
}