/*
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is 5 month".
Используйте коллекции.


Требования:
1. Программа должна считывать одно значение с клавиатуры.
2. Программа должна выводить текст на экран.
3. Программа должна использовать коллекции.
4. Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.
 */
package level8;

import java.util.*;
import java.io.*;

public class task196_lev8_lec11 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> month = new HashMap<>();
        Date date = new Date();

        month.put("January", 1);
        month.put("February", 2);
        month.put("March", 3);
        month.put("April", 4);
        month.put("May", 5);
        month.put("June", 6);
        month.put("July", 7);
        month.put("August", 8);
        month.put("September", 9);
        month.put("October", 10);
        month.put("November", 11);
        month.put("December", 12);

        String m = reader.readLine();
        for (Map.Entry<String, Integer> pair : month.entrySet()){
            if (pair.getKey().equalsIgnoreCase(m)){
                System.out.println(pair.getKey() + " is " + pair.getValue() + " month");
            }
        }
    }
}
