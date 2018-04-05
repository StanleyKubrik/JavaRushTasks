/*
Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.


Требования:
1. Программа должна считывать c консоли имя файла.
2. Программа должна выводить на экран содержимое файла.
3. Поток чтения из файла (FileInputStream) должен быть закрыт.
4. BufferedReader также должен быть закрыт.
 */
package javaCore.level13;

import java.io.*;

public class task310_lev13_lec11 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream in = new FileInputStream(reader.readLine());

        try {
            while (in.available() > 0){
                System.out.print((char)in.read());
            }

            System.out.println();
            in.close();
            reader.close();
        } catch (IOException e){
            System.out.println("Файл с данным именем не найден!");
            in.close();
            reader.close();
        }
    }
}
