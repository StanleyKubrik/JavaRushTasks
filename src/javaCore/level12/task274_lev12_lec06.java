/*
Кошки не должны быть абстрактными!
Унаследуй классы Cat и Dog от Pet.
Реализуй недостающие методы.
Классы Cat и Dog не должны быть абстрактными.


Требования:
1. Класс Pet должен быть абстрактным.
2. Класс Dog не должен быть абстрактным.
3. Класс Cat не должен быть абстрактным.
4. Класс Dog должен реализовать абстрактные методы из класса Pet.
5. Класс Cat должен реализовать абстрактные методы из класса Pet.
 */
package javaCore.level12;

public class task274_lev12_lec06 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return "Cat";
        }

        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet{
        @Override
        public String getName() {
            return "Dog";
        }

        @Override
        public Pet getChild() {
            return new Dog();
        }
    }
}
