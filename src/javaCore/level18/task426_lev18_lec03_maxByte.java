/*
Максимальный байт
Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.


Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должен выводиться максимальный байт, считанный из файла.
4. Поток чтения из файла должен быть закрыт.
 */
package javaCore.level18;

import java.io.*;

public class task426_lev18_lec03_maxByte {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream fis = new FileInputStream(name);
        int max = 0;

        while (fis.available() > 0){
            int tmp = fis.read();
            if (tmp > max){
                max = tmp;
            }
        }
        fis.close();
        System.out.println(max);
    }
}
