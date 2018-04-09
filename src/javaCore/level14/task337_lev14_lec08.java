/*
Нашествие исключений
Заполни список exceptions десятью(10) различными исключениями.
Первое исключение уже реализовано в методе initExceptions.


Требования:
1. Список exceptions должен содержать 10 элементов.
2. Все элементы списка exceptions должны быть исключениями(потомками класса Throwable).
3. Все элементы списка exceptions должны быть уникальны.
4. Метод initExceptions должен быть статическим.
 */
package javaCore.level14;

import java.util.*;
import java.io.*;

public class task337_lev14_lec08 {
    public static List<Exception> exceptions = new ArrayList<>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] ints = new int[5];
            int a = ints[5];
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Scanner file = new Scanner(new File("c:/users/user"));
            while (!file.next().equals("euadhsajd")) {
                file.next();
            }
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object[] x = new String[5];
            x[0] = 2;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String s = null;
            Object x = new Integer(1);
            s = (String) x;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] ints = new int[-5];
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int num = Integer.parseInt("XYZ");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String str = "hsadhjka";
            char c = str.charAt(50);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int a = 0;
            if(a == 0) throw new FactorialException("a равно 0", a);
        } catch (Exception e) {
            exceptions.add(e);
        }


    }

    static class FactorialException extends Exception {

        private int number;

        public int getNumber() {
            return number;
        }

        public FactorialException(String message, int num) {
            super(message);
            number = num;
        }
    }
}
