/*
Округление чисел
Считать с консоли 2 имени файла.
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
Округлить числа до целых и записать через пробел во второй файл.
Закрыть потоки.

Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4


Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Для первого файла создай поток для чтения. Для второго - поток для записи.
3. Считать числа из первого файла, округлить их и записать через пробел во второй.
4. Должны соблюдаться принципы округления, указанные в задании.
5. Созданные для файлов потоки должны быть закрыты.
 */
package javaCore.level18;

import java.io.*;

public class task445_lev18_lec11 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try (BufferedReader br = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter bw = new BufferedWriter(new FileWriter(reader.readLine())))
        {
            while (br.ready()){
                String str = br.readLine();
                String[] dstr = str.split("\\s");

                for (String s : dstr){
                    try {
                        int i = (int) Math.round(Double.parseDouble(s));
                        bw.write(i + " ");
                    } catch (NumberFormatException e) {
                        System.out.println(e);
                    }
                }
            }

            reader.close();
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*BufferedReader readBuff = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = readBuff.readLine();
        String fileName2 = readBuff.readLine();

        try( BufferedReader reader = new BufferedReader(new FileReader(new File(fileName1)));
             BufferedWriter writer = new BufferedWriter(new FileWriter(new File(fileName2)))
        )
        {

            String line;

            while((line = reader.readLine()) != null)
            {
                String[] numbers = line.split(" ");

                for(String num : numbers)
                {
                    try
                    {
                        int res = (int)Math.round(Double.parseDouble(num));
                        writer.write(res + " ");
                    }
                    catch(NumberFormatException e)
                    {
                        System.out.println(e);
                    }
                }
            }
        }
        catch(IOException e)
        {
            System.err.println(e);
        }*/
    }
}