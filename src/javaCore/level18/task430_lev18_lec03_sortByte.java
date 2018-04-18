/*
Сортировка байт
Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
Закрыть поток ввода-вывода.

Пример байт входного файла:
44 83 44

Пример вывода:
44 83


Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль через пробел должны выводиться все уникальные байты из файла в порядке возрастания.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.
 */
package javaCore.level18;

import java.io.*;
import java.util.*;

public class task430_lev18_lec03_sortByte {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream fis = new FileInputStream(name);
        HashSet<Byte> bytes = new HashSet<>();
        ArrayList<Byte> list = new ArrayList<>();

        while (fis.available() > 0){
            bytes.add((byte) fis.read());
        }
        fis.close();

        list.addAll(bytes);
        Collections.sort(list);

        for (Byte b : list){
            System.out.print(b + " ");
        }

        /* Alternative solution with TreeSet
        TreeSet<Byte> treeSet = new TreeSet<>();

        while (fis.available() > 0){
            treeSet.add((byte) fis.read());
        }
        fis.close();

        for (Byte b : treeSet){
            System.out.print(b + " ");
        }
        */
    }
}
