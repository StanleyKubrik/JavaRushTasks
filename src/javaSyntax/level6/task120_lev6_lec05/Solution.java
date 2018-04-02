/*
По 50 000 объектов Cat и Dog
Создать в цикле по 50 000 объектов Cat и Dog.
(Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).


Требования:
1. В классе Cat должен быть void метод finalize.
2. В классе Dog должен быть void метод finalize.
3. Метод finalize класса Cat должен выводить на экран "Cat was destroyed".
4. Метод finalize класса Dog должен выводить на экран "Dog was destroyed".
5. Метод main должен создавать 50000 объектов типа Cat и 50000 объектов типа Dog.
 */
package javaSyntax.level6.task120_lev6_lec05;

public class Solution {
    public static void main(String[] args) {
        Cat[] catAr = new Cat[50000];
        Dog[] dogAr = new Dog[50000];
        for (int x = 0; x < 50000; x++){
            catAr[x] = new Cat();
            dogAr[x] = new Dog();
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Dog was destroyed");
    }
}
