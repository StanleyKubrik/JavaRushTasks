/*
Int и Integer
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.


Требования:
1. Класс Solution должен содержать статический метод main().
2. Класс Solution должен содержать статический void метод print() с параметром типа int.
3. Класс Solution должен содержать статический void метод print() с параметром типа Integer.
4. Метод main() должен вызывать метод print() с параметром типа int.
5. Метод main() должен вызывать метод print() с параметром типа Integer.
 */
package javaCore.level12;

public class task266_lev12_lec04 {
    public static void main(String[] args) {
        print(5);
        Integer a = 7;
        print(a);
    }

    public static void print(int a){
    }

    public static void print(Integer a){
    }
}