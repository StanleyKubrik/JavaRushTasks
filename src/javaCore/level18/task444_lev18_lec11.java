/*
Объединение файлов
Считать с консоли 2 имени файла.
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
Закрыть потоки.


Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Для первого файла создай поток для чтения и считай его содержимое.
3. Затем, для первого файла создай поток для записи. Для второго - для чтения.
4. Содержимое первого и второго файла нужно объединить в первом файле.
5. Сначала должно идти содержимое второго файла, затем содержимое первого.
6. Созданные для файлов потоки должны быть закрыты.
 */
package javaCore.level18;

import java.io.*;

public class task444_lev18_lec11 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedInputStream file1Reader = new BufferedInputStream(new FileInputStream(file1));
        byte[] bytes1 = new byte[file1Reader.available()];
        file1Reader.read(bytes1);
        file1Reader.close();

        BufferedOutputStream file1Writer = new BufferedOutputStream(new FileOutputStream(file1));
        BufferedInputStream file2Reader = new BufferedInputStream(new FileInputStream(file2));
        byte[] bytes2 = new byte[file2Reader.available()];
        file2Reader.read(bytes2);
        file1Writer.write(bytes2);
        file2Reader.close();
        file1Writer.close();

        BufferedOutputStream file11Writer = new BufferedOutputStream(new FileOutputStream(file1, true));
        file11Writer.write(bytes1);
        file11Writer.close();
    }
}
