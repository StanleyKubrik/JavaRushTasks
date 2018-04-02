/*
Суммирование
Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна посчитать сумму введенных чисел. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
4. В программе должен использоваться цикл for или цикл while.
*/
package javaSyntax.level4;

import java.io.*;

public class task88_lev4_lec16 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        while (true){
            int num = Integer.parseInt(reader.readLine()); // одна итерация цикла - один раз счёл со строки
            sum += num;
            if (num == -1){
                System.out.println(sum);
                break;
            }
        }
    }
}