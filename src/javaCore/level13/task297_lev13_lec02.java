/*
Четыре ошибки
Исправь 4 ошибки в программе, чтобы она компилировалась.


Требования:
1. Переменные объявленные в интерфейсе могут иметь только самый широкий уровень доступа(public).
2. Унаследоваться(extends) можно только от класса, для реализации интерфейсов используется ключевое слово implements.
3. Класс Hobbie должен быть объявлен с модификатором доступа static.
4. Для доступа к переменной HOBBIE нет необходимости создавать объект Dream.
5. Объявления интерфейсов не изменять.
 */
package javaCore.level13;

public class task297_lev13_lec02 {
    public static void main(String[] args) throws Exception {

        System.out.println(Dream.HOBBIE.toString());
        System.out.println(new Hobbie().toString());

    }

    interface Desire {
    }

    interface Dream {
        Hobbie HOBBIE = new Hobbie();
    }

    static class Hobbie implements Dream, Desire {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
