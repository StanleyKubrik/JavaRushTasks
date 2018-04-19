/*
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.


Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
3. Во второй файл нужно записать все байты из первого в обратном порядке.
4. Потоки FileInputStream и FileOutputStream должны быть закрыты.
 */
package javaCore.level18;

import java.io.*;

public class task434_lev18_lec05 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileIS = new FileInputStream(reader.readLine());
        FileOutputStream fileOS = new FileOutputStream(reader.readLine());

        byte[] bytes = new byte[fileIS.available()];
        int count = fileIS.read(bytes);

        for (int i = count - 1; i >= 0; i--){
            fileOS.write(bytes[i]);
        }

        reader.close();
        fileIS.close();
    }
}
