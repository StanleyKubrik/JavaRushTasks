/*
Два в одном
Считать с консоли 3 имени файла.
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
Закрыть потоки.


Требования:
1. Программа должна три раза считать имена файлов с консоли.
2. Для первого файла создай поток для записи. Для двух других - потоки для чтения.
3. Содержимое второго файла нужно переписать в первый файл.
4. Содержимое третьего файла нужно дописать в первый файл (в который уже записан второй файл).
5. Созданные для файлов потоки должны быть закрыты.
 */
package javaCore.level18;

import java.io.*;

public class task443_lev18_lec11 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileOutputStream writer = new FileOutputStream(reader.readLine(), true); // Желательно это всё заносить в буффер
        FileInputStream fileInputStream1 = new FileInputStream(reader.readLine());
        FileInputStream fileInputStream2 = new FileInputStream(reader.readLine());

        while (fileInputStream1.available() > 0) {
            writer.write(fileInputStream1.read());
        }

        while (fileInputStream2.available() > 0) {
            writer.write(fileInputStream2.read());
        }

        writer.close();
        fileInputStream1.close();
        fileInputStream2.close();
    }
}
