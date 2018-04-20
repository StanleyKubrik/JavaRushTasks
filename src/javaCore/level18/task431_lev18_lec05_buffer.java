/*
Исправить ошибки
Исправить функциональность в соответствии с требованиями.

Программа должна:
1. Переписать все байты одного файла в другой одним куском.
2. Закрывать потоки ввода-вывода.

Подсказка:
4 ошибки.


Требования:
1. Программа должна использовать классы FileInputStream и FileOutputStream.
2. Программа должна переписать все байты одного файла в другой одним куском.
3. Потоки FileInputStream и FileOutputStream должны быть закрыты.
4. Нужно исправить 4 ошибки.
 */
package javaCore.level18;

import java.io.*;

public class task431_lev18_lec05_buffer {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("test.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("test3.txt");

        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        inputStream.close();
        outputStream.close();
    }
}
