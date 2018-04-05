/*
Том, Джерри и Спайк
1. Создай классы Dog, Cat и Mouse.
2. Реализуй интерфейсы в добавленных классах, учитывая что:
- Кот(Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
- Мышь(Mouse) может передвигаться и может быть съедена.
- Собака(Dog) может передвигаться и съесть кого-то.


Требования:
1. Класс Cat должен быть объявлен внутри класса Solution.
2. Класс Dog должен быть объявлен внутри класса Solution.
3. Класс Mouse должен быть объявлен внутри класса Solution.
4. Кот(Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
5. Мышь(Mouse) может передвигаться и может быть съедена.
6. Собака(Dog) может передвигаться и съесть кого-то.
 */
package javaCore.level13;

public class task307_lev13_lec06_TomAndJerry {
    public static void main(String[] args) {

    }
    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Eatable {
        void eaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    public static class Dog implements Movable, Eat {
        @Override
        public void move() {
        }

        @Override
        public void eat() {
        }
    }

    public static class Cat implements Movable, Eatable, Eat{
        @Override
        public void move() {
        }

        @Override
        public void eaten() {
        }

        @Override
        public void eat() {
        }
    }

    public static class Mouse implements Movable, Eatable{
        @Override
        public void move() {
        }

        @Override
        public void eaten() {
        }
    }
}
