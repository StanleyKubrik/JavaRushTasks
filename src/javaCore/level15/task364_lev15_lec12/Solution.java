/*
Файл в статическом блоке
1. Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2. В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.


Требования:
1. Константа FILE_NAME не должна быть пустой.
2. В статическом блоке все строки из файла с именем FILE_NAME должны быть добавлены по-отдельности в список lines.
3. Поле FILE_NAME НЕ должно быть final.
4. Класс Solution должен содержать список lines.
 */
package javaCore.level15.task364_lev15_lec12;

import java.util.*;
import java.io.*;

public class Solution {
    public static List<String> lines = new ArrayList<>();

    static {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME)));

            /* Alternative solution
            for (Object o : reader.lines().toArray()) {
                lines.add(o.toString());
            }
            */

            while (reader.ready()){
                lines.add(reader.readLine());
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);

        /* Print test
        for (String s : lines){
            System.out.println(s);
        }
        */
    }
}
