/*
Перехват unchecked-исключений
В методе processExceptions обработайте все unchecked исключения.
Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
Можно использовать только один блок try..catch


Требования:
1. Метод processExceptions должен вызывать метод method1.
2. Метод processExceptions должен вызывать метод method2.
3. Метод processExceptions должен вызывать метод method3.
4. Метод processExceptions должен использовать только один блок try..catch.
5. Метод processExceptions должен отлавливать все unchecked исключения и выводить стек-трейс каждого из них, используя метод printStack.
6. Программа должна выводить на экран текст.
 */
package level9.exception;

public class task215_lev9_lec08 {
    public static void main(String[] args) {
        processExceptions(new task215_lev9_lec08());
    }

    public static void processExceptions(task215_lev9_lec08 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (NullPointerException e){
            printStack(e);
        } catch (IndexOutOfBoundsException e){
            printStack(e);
        } catch (NumberFormatException e){
            printStack(e);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}
