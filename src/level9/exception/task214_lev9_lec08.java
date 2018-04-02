/*
Перехват checked-исключений
В методе processExceptions обработайте все checked исключения.
Нужно вывести на экран возникшее checked исключение.
Можно использовать только один блок try..catch


Требования:
1. Метод processExceptions должен вызывать метод method1.
2. Метод processExceptions должен вызывать метод method2.
3. Метод processExceptions должен вызывать метод method3.
4. Метод processExceptions должен использовать только один блок try..catch.
5. Метод processExceptions должен отлавливать и выводить на экран все возникающие checked исключения.
6. Программа должна выводить на экран текст.
 */
package level9.exception;

import java.io.*;
import java.rmi.*;

public class task214_lev9_lec08 {
    public static void main(String[] args) throws Exception {
        processExceptions(new task214_lev9_lec08());
    }

    public static void processExceptions(task214_lev9_lec08 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (RemoteException e) {
            System.out.println("RemoteException");
        } catch (NoSuchFieldException e){
            System.out.println("NoSuchFieldException");
        } catch (IOException e){
            System.out.println("IOException");
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
