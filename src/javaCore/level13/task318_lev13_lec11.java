/*
<<<<<<< HEAD
Писатель в файл с консоли
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
=======
Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
>>>>>>> fd62360fcf213e6e4e90c2d3a8c852660e2781cd


Требования:
1. Программа должна считывать c консоли имя файла.
<<<<<<< HEAD
2. Создай и используй объект типа BufferedWriter.
3. Программа не должна ничего читать из файловой системы.
4. Программа должна читывать строки с консоли, пока пользователь не введет строку "exit".
5. Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
6. Метод main должен закрывать объект типа BufferedWriter после использования.
=======
2. Программа должна выводить на экран содержимое файла.
3. Поток чтения из файла (FileInputStream) должен быть закрыт.
4. BufferedReader также должен быть закрыт.
>>>>>>> fd62360fcf213e6e4e90c2d3a8c852660e2781cd
 */
package javaCore.level13;

import java.io.*;
import java.util.*;

public class task318_lev13_lec11 {
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

        InputStream in = new FileInputStream(reader.readLine());

        try {
            while (in.available() > 0){
                System.out.print((char)in.read());
            }

            System.out.println();
            in.close();
            reader.close();
        } catch (IOException e){
            System.out.println("Файл с данным именем не найден!");
            in.close();
            reader.close();
        }

    }
}
