/*
Лететь, бежать и плыть
Напиши public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
Добавить в каждый интерфейс по одному методу.


Требования:
1. Класс Solution должен содержать интерфейс Fly.
2. Класс Solution должен содержать интерфейс Run.
3. Класс Solution должен содержать интерфейс Swim.
4. Интерфейс Fly должен содержать один метод.
5. Интерфейс Run должен содержать один метод.
6. Интерфейс Swim должен содержать один метод.
 */
package javaCore.level12.interfaces;

public class task276_lev12_lec08 {
    public static void main(String[] args) {

    }

    interface Fly{
        void fly();
    }

    interface Run{
        void run();
    }

    interface Swim{
        void swim();
    }
}
