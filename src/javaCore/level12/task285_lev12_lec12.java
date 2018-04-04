/*
Лазать, летать и бегать
1. Внутри класса Solution создай интерфейс public interface Fly(летать) с методом void fly().
2. Внутри класса Solution создай интерфейс public interface Climb(лазить по деревьям) с методом void climb().
3. Внутри класса Solution создай интерфейс public interface Run(бегать) с методом void run().
4. Подумай логически, какие именно интерфейсы нужно добавить для каждого класса.
5. Добавь интерфейсы классам Cat(кот), Dog(собака), Tiger(тигр), Duck(Утка).


Требования:
1. Класс Solution должен содержать интерфейс Fly с методом void fly().
2. Класс Solution должен содержать интерфейс Climb с методом void climb().
3. Класс Solution должен содержать интерфейс Run с методом void run().
4. Объект класса Cat должен уметь бегать(поддерживать интерфейс Run) и лазить по деревьям(поддерживать интерфейс Climb).
5. Объект класса Dog должен уметь бегать(поддерживать интерфейс Run).
6. Класс Tiger должен быть котом.
7. Объект класса Duck должен уметь бегать(поддерживать интерфейс Run) и летать(поддерживать интерфейс Fly).
 */
package javaCore.level12;

public class task285_lev12_lec12 {
    public static void main(String[] args) {

    }

    interface Fly{
        void fly();
    }

    interface Climb{
        void climb();
    }

    interface Run{
        void run();
    }

    public class Cat implements Run, Climb {
        @Override
        public void run() {
        }

        @Override
        public void climb() {
        }
    }

    public class Dog implements Run {
        @Override
        public void run() {
        }
    }

    public class Tiger extends Cat {
        @Override
        public void run() {
            super.run();
        }

        @Override
        public void climb() {
            super.climb();
        }
    }

    public class Duck implements Fly, Run {
        @Override
        public void fly() {
        }

        @Override
        public void run() {
        }
    }
}
