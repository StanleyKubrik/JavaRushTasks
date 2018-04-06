/*
Писатель в файл с консоли
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.


Требования:
1. Программа должна считывать c консоли имя файла.
2. Создай и используй объект типа BufferedWriter.
3. Программа не должна ничего читать из файловой системы.
4. Программа должна читывать строки с консоли, пока пользователь не введет строку "exit".
5. Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
6. Метод main должен закрывать объект типа BufferedWriter после использования.
 */
package javaCore.level13;

import java.io.*;
import java.util.*;

public class task310_lev13_lec11 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        ArrayList<String> arrayList = new ArrayList<>();

        while (true){
            String s = reader.readLine();
            arrayList.add(s);
            if (s.equals("exit")){ break; }
        }

        reader.close();
        File f = new File(name);
        BufferedWriter writer = new BufferedWriter(new PrintWriter(f));
        for (int i = 0; i < arrayList.size(); i++){
            writer.write(arrayList.get(i));
            writer.newLine();
        }
        writer.close();
    }
}
