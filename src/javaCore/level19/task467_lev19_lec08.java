/*
Решаем пример
В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна выводить на консоль решенный пример.
Вызови готовый метод printSomething(), воспользуйтесь testString.
Верни переменной System.out первоначальный поток.

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9


Требования:
1. Класс Solution должен содержать класс TestString.
2. Класс Solution должен содержать публичное статическое поле testString типа TestString, которое сразу
проинициализировано.
3. Класс TestString должен содержать публичный void метод printSomething().
4. Метод printSomething() класса TestString должен выводить на экран строку "3 + 6 = ".
5. Метод main(String[] args) класса Solution должен создавать поток PrintStream (используй PrintStream
c параметром конструктора ByteArrayOutputStream).
6. Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль
объекта System.out.
7. Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
8. Метод main(String[] args) класса Solution должен модифицировать строку выведенную методом printSomething()
согласно заданию, и выводить её в консоль.
 */
package javaCore.level19;

import java.io.*;

public class task467_lev19_lec08 {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(consoleStream);
        String[] res = result.replaceAll("(\\D+$)", "").split("\\s");  // массив из {3, +, 6}
        if (res[1].equals("+")){
            System.out.printf("%s + %s = %d", res[0], res[2], Integer.parseInt(res[0]) + Integer.parseInt(res[2]));
        } else if (res[1].equals("-")) {
            System.out.printf("%s - %s = %d", res[0], res[2], Integer.parseInt(res[0]) - Integer.parseInt(res[2]));
        } else if (res[1].equals("*")){
            System.out.printf("%s * %s = %d", res[0], res[2], Integer.parseInt(res[0]) * Integer.parseInt(res[2]));
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 - 6 = ");
        }
    }
}
