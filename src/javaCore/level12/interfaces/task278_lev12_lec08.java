/*
Создаем человека
Есть public интерфейсы Fly(летать), Run(бежать/ездить), Swim(плавать).
Добавь эти интерфейсы классам Human(человек), Duck(утка), Penguin(пингвин), Airplane(самолет).


Требования:
1. Класс Solution должен содержать интерфейс Fly с одним методом fly().
2. Класс Solution должен содержать интерфейс Run с одним методом run().
3. Класс Solution должен содержать интерфейс Swim с одним методом swim().
4. Человек должен уметь бегать и плавать.
5. Утка должна уметь летать, плавать и бегать.
6. Пингвин должен уметь плавать и бегать.
7. Самолет должен уметь летать и ездить.
 */
package javaCore.level12.interfaces;

public class task278_lev12_lec08 {
    public static void main(String[] args) {

    }

    interface Fly {
        void fly();
    }

    interface Run {
        void run();
    }

    interface Swim {
        void swim();
    }


    public class Human implements Run, Swim {
        @Override
        public void run() {
        }

        @Override
        public void swim() {
        }
    }

    public class Duck implements Fly, Swim, Run {
        @Override
        public void fly() {
        }

        @Override
        public void swim() {
        }

        @Override
        public void run() {
        }
    }

    public class Penguin implements Swim, Run {
        @Override
        public void swim() {
        }

        @Override
        public void run() {
        }
    }

    public class Airplane implements Fly, Run {
        @Override
        public void run() {
        }

        @Override
        public void fly() {
        }
    }
}
