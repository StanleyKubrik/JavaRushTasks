/*
Самые редкие байты
Ввести с консоли имя файла.
Найти байт или байты с минимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.


Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль через пробел должны выводиться все байты из файла с минимальным количеством повторов.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.
 */
package javaCore.level18;

import java.util.*;
import java.io.*;

public class task429_lev18_lec03_byteRepeatMin {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream fis = new FileInputStream(name);
        ArrayList<Byte> list = new ArrayList<>();

        while (fis.available() > 0){
            list.add((byte) fis.read());
        }
        fis.close();

        int count;
        HashMap<Byte ,Integer > map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            count = Collections.frequency(list, list.get(i));
            map.put(list.get(i), count);
        }

        if(!map.isEmpty()){
            int min = Collections.min(map.values());
            for (Map.Entry<Byte,Integer> pair: map.entrySet()) {
                if(pair.getValue() == min)
                    System.out.print(pair.getKey() + " ");
            }
        }
    }
}
