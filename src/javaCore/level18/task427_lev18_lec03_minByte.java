/*
Минимальный байт
Ввести с консоли имя файла.
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.


Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должен выводиться минимальный байт, считанный из файла.
4. Поток чтения из файла должен быть закрыт.
 */
package javaCore.level18;

import java.io.*;

public class task427_lev18_lec03_minByte {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream fis = new FileInputStream(name);
        int min = 0;

        while (fis.available() > 0){
            int tmp = fis.read();
            if (tmp != 0){
                min = tmp;
            }
        }
        fis.close();
        System.out.println(min);
    }
}
