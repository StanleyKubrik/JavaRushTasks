/*
Исправление ошибок
1. Переделай наследование в классах и интерфейсах так, чтобы программа компилировалась и продолжала делать то же самое.
2. Класс Hobbie должен наследоваться от интерфейсов Desire, Dream.


Требования:
1. Интерфейс Desire должен быть реализован в классе Hobbie.
2. Интерфейс Dream должен быть реализован в классе Hobbie.
3. Класс Hobbie должен содержать статическую переменную INDEX.
4. Метод toString в классе Hobbie должен инкрементировать и возвращать переменную INDEX в виде строки.
 */
package javaCore.level13;

public class task312_lev13_lec11 {
    public static void main(String[] args) throws Exception {
        System.out.println(Dream.HOBBIE.toString());
        System.out.println(new Hobbie().INDEX);
    }

    interface Desire {
    }

    interface Dream {
        Hobbie HOBBIE = new Hobbie();
    }

    static class Hobbie implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
