/*
НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.


Требования:
1. Программа должна считывать с клавиатуры 2 строки.
2. В случае если введенные строки невозможно преобразовать в положительные целые числа, должно возникать исключение.
3. Программа должна выводить данные на экран.
4. Программа должна выводить на экран наибольший общий делитель(НОД) чисел считанных с клавиатуры и успешно завершаться.
 */
package javaCore.level14;

import java.io.*;

public class task338_lev14_lec08 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        try {
            if (a <= 0 || b <= 0) throw new Exception();
            int div = 1;
            int min;
            if (a < b) min = a;
            else min = b;
            for (int i = min; i > 0; i--){
                if (a % i == 0 && b % i == 0){
                    div = i;
                    break;
                }
            }
            System.out.println(div);
        } catch (Exception e){
            throw e;
        }
    }
}
