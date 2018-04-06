/*
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

Пример ввода:
5
8
11
3
2
10

Пример вывода:
2
8
10


Требования:
1. Программа должна считывать данные с консоли.
2. Программа должна создавать FileInputStream для введенной с консоли строки.
3. Программа должна выводить данные на экран.
4. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
5. Программа должна закрывать поток чтения из файла(FileInputStream).
 */
package javaCore.level13;

import java.io.*;
import java.util.*;

public class task317_lev13_lec11_sortFromFile {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> integers = new ArrayList<>();

        /*
        try {
            String name = reader.readLine();
            InputStream in = new FileInputStream(name);
            while (in.available() > 0) {
                integers.add(in.read());
            }
            in.close();
        } catch (IOException e){
            System.out.println("Error");
        }

        int[] evenInts = new int[integers.size()];
        int x = 0;
        for (int i : integers){
            if (i % 2 == 0){
                evenInts[x] = i;
                x++;
            }
        }

        Arrays.sort(evenInts);
        */
        String name = reader.readLine();
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(name)));

        ArrayList<Integer> list = new ArrayList<>();
        while (reader.ready()){
            int x = Integer.parseInt(reader.readLine());
            if (x % 2 == 0){
                list.add(x);
            }
        }
        reader.close();

        Collections.sort(list);

        for (int i : list){
            System.out.println(i + " ");
        }
    }
}
