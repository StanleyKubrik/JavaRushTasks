/*
Адаптер
Используй класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter.


Требования:
1. AmigoStringWriter должен быть интерфейсом.
2. Класс AdapterFileOutputStream должен реализовывать интерфейс AmigoStringWriter.
3. Класс AdapterFileOutputStream должен содержать приватное поле fileOutputStream типа FileOutputStream.
4. Класс AdapterFileOutputStream должен содержать конструктор с параметром FileOutputStream.
5. Метод flush() класса AdapterFileOutputStream должен делегировать полномочие такому же методу fileOutputStream.
6. Метод writeString(String s) класса AdapterFileOutputStream должен делегировать полномочие такому
же методу fileOutputStream.
7. Метод close() класса AdapterFileOutputStream должен делегировать полномочие такому же методу fileOutputStream.
 */
package javaCore.level19.task455_lev19_lec03;

import java.io.*;

public class AdapterFileOutputStream implements AmigoStringWriter {
    private FileOutputStream fileOutputStream = null;

    public AdapterFileOutputStream(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }

    public static void main(String[] args) {

    }

    public void writeString(String s) throws IOException {
        fileOutputStream.write(s.getBytes());
    }

    public void close() throws IOException {
        fileOutputStream.close();
    }

    public void flush() throws IOException {
        fileOutputStream.flush();
    }
}
