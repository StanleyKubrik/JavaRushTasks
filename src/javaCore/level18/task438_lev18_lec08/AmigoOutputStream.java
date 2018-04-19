/*
AmigoOutputStream
1 Измени класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используй наследование.
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 Вызвать метод flush().
2.2 Дописать следующий текст "JavaRush © All rights reserved.", используй метод getBytes().
2.3 Закрыть поток методом close().


Требования:
1. Метод main изменять нельзя.
2. Класс AmigoOutputStream должен наследоваться от класса FileOutputStream.
3. Класс AmigoOutputStream должен принимать в конструкторе обьект типа FileOutputStream.
4. Все методы write(), flush(), close() в классе AmigoOutputStream должны делегировать свое выполнение
объекту FileOutputStream.
5. Метод close() должен сначала вызвать метод flush(), затем дописать текст, затем закрыть поток.
 */
package javaCore.level18.task438_lev18_lec08;

import java.io.*;
import java.nio.channels.FileChannel;

public class AmigoOutputStream extends FileOutputStream {
    private FileOutputStream file;
    public static String fileName = "C:/tmp/result.txt";

    public AmigoOutputStream(FileOutputStream file) throws FileNotFoundException {
        super(fileName);
        this.file = file;
    }

    @Override
    public void write(int b) throws IOException {
        file.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        file.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        file.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        file.flush();
        write("JavaRush © All rights reserved.".getBytes());
        file.close();
    }

    @Override
    public FileChannel getChannel() {
        return file.getChannel();
    }

    @Override
    public void flush() throws IOException {
        file.flush();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }
}
