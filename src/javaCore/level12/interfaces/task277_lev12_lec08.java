/*
Есть, летать и двигаться
Есть public интерфейсы Fly(летать), Move(передвигаться), Eat(есть).
Добавь эти интерфейсы классам Dog(собака), Car(автомобиль), Duck(утка), Airplane(самолет).


Требования:
1. Класс Solution должен содержать интерфейс Fly с одним методом fly().
2. Класс Solution должен содержать интерфейс Move с одним методом move().
3. Класс Solution должен содержать интерфейс Eat с одним методом eat().
4. Собака должна уметь передвигаться и есть.
5. Автомобиль должен уметь передвигаться.
6. Самолет должен уметь передвигаться и летать.
7. Утка должна уметь передвигаться, летать и есть.
 */
package javaCore.level12.interfaces;

public class task277_lev12_lec08 {
    public static void main(String[] args) {

    }

    interface Fly {
        void fly();
    }

    interface Move {
        void move();
    }

    interface Eat {
        void eat();
    }

    public class Dog implements Move, Eat {
        @Override
        public void move() {
        }

        @Override
        public void eat() {
        }
    }

    public class Duck implements Fly, Move, Eat {
        @Override
        public void eat() {
        }

        @Override
        public void move() {
        }

        @Override
        public void fly() {
        }
    }

    public class Car implements Move {
        @Override
        public void move() {
        }
    }

    public class Airplane implements Fly, Move {
        @Override
        public void move() {
        }

        @Override
        public void fly() {
        }
    }
}
