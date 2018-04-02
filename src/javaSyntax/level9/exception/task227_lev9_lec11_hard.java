/*
Обогатим код функциональностью!
Задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то программа должна вывести надпись "Файл не существует." и еще раз прочитать имя файла с консоли, а уже потом считывать файл для записи.


Требования:
1. Программа должна считывать имена файлов.
2. Метод main должен обрабатывать исключения кидаемые методом getInputStream. Если возникло исключение, нужно вывести сообщение «Файл не существует.» и еще раз прочитать имя файла с консоли.
3. Программа должна копировать содержимое первого файла во второй.
4. В методе main должен вызываться метод getInputStream.
5. Метод getInputStream изменять нельзя.
6. В методе main должен вызывать метод getOutputStream.
7. Метод getOutputStream изменять нельзя.
 */
package javaSyntax.level9.exception;

import java.io.*;

public class task227_lev9_lec11_hard {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        InputStream fileInputStream = null;

        try {
            fileInputStream = getInputStream(sourceFileName);
        } catch (FileNotFoundException e){
            System.out.println("Файл не существует.");
            sourceFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);
        }

        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
/*
1. Альтернативное решение без выбрасиваний ошибок
if (sourceFileName.isEmpty()){
            System.out.print("Исходный файл не найден. Введите директорию повторно: ");
            String sourceFileName1 = reader.readLine();
            sourceFileName = sourceFileName1;
        }
2. А тут пользователь вводит директорию 1-го файла до тех пор, пока не введёт праавильную.
InputStream fileInputStream;

        while (true){
            try {
                fileInputStream = getInputStream(sourceFileName);
                break;
            } catch (IOException e){
                System.out.println("Файл не найден.");
                sourceFileName = reader.readLine();
            }
        }
 */
