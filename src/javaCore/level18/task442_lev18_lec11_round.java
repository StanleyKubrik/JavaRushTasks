/*
Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45.
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой.
4. Закрыть потоки.


Требования:
1. Считывать с консоли ничего не нужно.
2. Создай поток чтения из файла, который приходит первым параметром в main.
3. Посчитай отношение пробелов ко всем символам в файле и выведи в консоль это число.
4. Выведенное значение необходимо округлить до 2 знаков после запятой.
5. Поток чтения из файла должен быть закрыт.
 */
package javaCore.level18;

import java.io.*;
import java.math.BigDecimal;

public class task442_lev18_lec11_round {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream(args[0]);
        int symb = file.available();
        int space = 0;

        while (file.available() > 0){
            if (file.read() == 32){
                space++;
            }
        }
        file.close();

        double rez = (double) space / symb * 100;
        //String srez = String.format("%.2f", rez);
        BigDecimal BDrez = new BigDecimal(rez).setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(BDrez);
    }
}
