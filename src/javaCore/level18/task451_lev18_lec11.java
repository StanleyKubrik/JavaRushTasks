/*
Шифровка
Придумать механизм шифровки/дешифровки.

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName

где:
fileName - имя файла, который необходимо зашифровать/расшифровать.
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования.
-e - ключ указывает, что необходимо зашифровать данные.
-d - ключ указывает, что необходимо расшифровать данные.


Требования:
1. Считывать с консоли ничего не нужно.
2. Создай поток для чтения из файла, который приходит вторым параметром ([fileName]).
3. Создай поток для записи в файл, который приходит третьим параметром ([fileOutputName]).
4. В режиме "-e" программа должна зашифровать [fileName] и записать в [fileOutputName].
5. В режиме "-d" программа должна расшифровать [fileName] и записать в [fileOutputName].
6. Созданные для файлов потоки должны быть закрыты.
 */
package javaCore.level18;

import java.io.*;

public class task451_lev18_lec11 {
    public static void main(String[] args) throws Exception {
        BufferedInputStream fileReader = new BufferedInputStream(new FileInputStream(args[1]));
        BufferedOutputStream fileWriter = new BufferedOutputStream(new FileOutputStream(args[2]));

        /*switch (args[0]){
            case "-e":
                while (fileReader.available() > 0){
                    fileWriter.write(fileReader.read() * 3);
                }
                fileReader.close();
                fileWriter.close();
                break;
        }*/

        if (args[0].equals("-e")) {
            while (fileReader.available() > 0){
                fileWriter.write(fileReader.read() + 3);
            }
            fileReader.close();
            fileWriter.close();
        }

        if (args[0].equals("-d")) {
            while (fileReader.available() > 0){
                fileWriter.write(fileReader.read() - 3);
            }
            fileReader.close();
            fileWriter.close();
        }
    }
}