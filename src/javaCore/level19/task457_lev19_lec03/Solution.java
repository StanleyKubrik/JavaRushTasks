/*
И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
В классе адаптере создать приватное финальное поле Scanner fileScanner. Поле инициализировать в
конструкторе с одним аргументом типа Scanner.

Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950
Петров Петр Петрович 31 12 1957

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read()
должен читать данные только одного человека.


Требования:
1. PersonScanner должен быть интерфейсом.
2. Класс PersonScannerAdapter должен реализовывать интерфейс PersonScanner.
3. Класс PersonScannerAdapter должен содержать приватное поле fileScanner типа Scanner.
4. Класс PersonScannerAdapter должен содержать конструктор с параметром Scanner.
5. Метод close() класса PersonScannerAdapter должен делегировать полномочие такому же методу fileScanner.
6. Метод read() класса PersonScannerAdapter должен читать строку с файла, парсить её, и возвращать
данные только одного человека, в виде объекта класса Person.
 */
package javaCore.level19.task457_lev19_lec03;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        /* Test
        String name = "Иванов Иван Иванович 13 09 1993";

        PersonScannerAdapter adapter = new PersonScannerAdapter(new Scanner(name));
        System.out.println(adapter.read());*/
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        public Person read() throws IOException {
            String line = fileScanner.nextLine();
            String[] strings = line.split("\\s");
            SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
            Date bd = null;
            try {
                bd = sdf.parse(strings[3] + strings[4] + strings[5]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return new Person(strings[1], strings[2], strings[0], bd);
        }

        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
