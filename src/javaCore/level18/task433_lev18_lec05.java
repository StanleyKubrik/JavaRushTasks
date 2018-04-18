/*
Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.


Требования:
1. Программа должна три раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файлы - FileOutputStream
3. Первую половину байт из первого файла нужно записать во второй файл.
4. Вторую половину байт из первого файла нужно записать в третий файл.
5. Потоки FileInputStream и FileOutputStream должны быть закрыты.
 */
package javaCore.level18;

import java.io.*;

public class task433_lev18_lec05 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileIS = new FileInputStream(reader.readLine());
        FileOutputStream fileOS = new FileOutputStream(reader.readLine());

        int a = fileIS.available();
        byte[] bytes = new byte[(a + 1) / 2];
        int count = fileIS.read(bytes);
        fileOS.write(bytes, 0, count);
        fileOS.close();

        fileOS = new FileOutputStream(reader.readLine());
        bytes = new byte[a / 2];
        count = fileIS.read(bytes);
        fileOS.write(bytes, 0, count);

        reader.close();
        fileIS.close();
    }
}
