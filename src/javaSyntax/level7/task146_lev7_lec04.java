/*
Улицы и дома
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - число жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."

Примечание:
дом с порядковым номером 0 считать четным.


Требования:
1. Программа должна создавать массив на 15 целых чисел.
2. Программа должна считывать числа для массива с клавиатуры.
3. Программа должна вывести сообщение "В домах с нечетными номерами проживает больше жителей.", если сумма нечетных элементов массива больше суммы четных.
4. Программа должна вывести сообщение "В домах с четными номерами проживает больше жителей.", если сумма четных элементов массива больше суммы нечетных.
 */
package javaSyntax.level7;

import java.io.*;

public class task146_lev7_lec04 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[15];
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.valueOf(reader.readLine());
        }

        int even = 0;
        int odd = 0;

        for (int x = 0; x < 15; x++){
            if (x % 2 == 0)
                even += array[x];
            else
                odd += array[x];
        }

        if (even > odd) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей." );
    }
}
