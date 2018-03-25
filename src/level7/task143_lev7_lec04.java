/*
Общение одиноких массивов
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.


Требования:
1. Программа должна создавать массив на 10 строк.
2. Программа должна создавать массив на 10 целых чисел.
3. Программа должна считывать строки для массива с клавиатуры.
4. Программа должна в массив чисел записать длины строк из массива строк, а затем их вывести на экран.
 */
package level7;

import java.io.*;

public class task143_lev7_lec04 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] sArr = new String[10];
        int[] dArr = new int[10];

        for (int i = 0; i < sArr.length; i++){
            sArr[i] = reader.readLine();
        }

        for (int x = 0; x < dArr.length; x++){
            dArr[x] = sArr[x].length();
        }
        for (int s:dArr){
            System.out.println(s);
        }
    }
}
