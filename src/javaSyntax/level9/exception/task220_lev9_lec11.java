/*
Какое сегодня число?
Ввести с клавиатуры дату в формате "08/18/2013"
Вывести на экран эту дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat.


Требования:
1. Программа должна считывать данные с клавиатуры.
2. В программе должна быть объявлена переменная типа SimpleDateFormat.
3. В программе должна быть объявлена переменная типа Date.
4. Программа должна выводить данные на экран.
5. Вывод должен соответствовать заданию.
 */
package javaSyntax.level9.exception;

import java.util.*;
import java.io.*;
import java.text.*;

public class task220_lev9_lec11 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String oldDate = reader.readLine();
        SimpleDateFormat oldDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat newDateFormat = new SimpleDateFormat("MMM dd, yyyy");

        Date date = oldDateFormat.parse(oldDate);
        String newDate = newDateFormat.format(date).toUpperCase();

        System.out.println(newDate);
    }
}
