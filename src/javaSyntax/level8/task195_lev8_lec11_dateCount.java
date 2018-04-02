/*
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.

Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false


Требования:
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().
 */
package javaSyntax.level8;

import java.util.*;

public class task195_lev8_lec11_dateCount {
    public static void main(String[] args) throws Exception {
        System.out.println(isDateOdd("FEB 1 1970"));
    }

    public static boolean isDateOdd(String date) throws Exception {
        Date startTime = new Date(date); // меняем вводную дату на начальную
        startTime.setSeconds(0);
        startTime.setMinutes(0);
        startTime.setHours(0);
        startTime.setDate(1);
        startTime.setMonth(0);

        Date endTime = new Date(date);
        long msTimeInterval = endTime.getTime() - startTime.getTime(); // находим разницу в миллисекундах
        long msDay = 24 * 60 * 60 * 1000; // миллисекунд в 1 дне

        int days = (int)(msTimeInterval/msDay); // кастим long в int
        boolean dateOdd;
        if (days % 2 == 0)
            dateOdd = true;
        else
            dateOdd = false;

        return dateOdd;
    }
}
