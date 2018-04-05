/*
Исключения. Просто исключения.
Есть метод, который выбрасывает два исключения, унаследованные от Exception, и два унаследованных от RuntimeException:
NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.

Нужно перехватить NullPointerException и FileNotFoundException, но не перехватывать
ArithmeticException и URISyntaxException.
Как это сделать?


Требования:
1. Метод main должен вызывать метод method1.
2. Метод main должен перехватывать исключение NullPointerException.
3. Метод main должен перехватывать исключение FileNotFoundException.
4. Метод main не должен перехватывать исключение ArithmeticException.
5. Метод main не должен перехватывать исключение URISyntaxException.
6. Метод method1 не изменять.
 */
package javaSyntax.level9.exception;

import java.io.*;
import java.net.*;

public class task211_lev9_lec08 {
    public static void main(String[] args) throws Exception {
        try {
            method1();
        } catch (NullPointerException e){}
        catch (FileNotFoundException e){}
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }
}