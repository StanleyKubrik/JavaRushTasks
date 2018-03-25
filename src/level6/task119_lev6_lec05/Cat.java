/*
Пустые кошки, пустые псы
В каждом классе Cat и Dog написать метод finalize, который выводит на экран текст о том, что такой-то объект уничтожен.


Требования:
1. В классе Cat должен быть void метод finalize.
2. В классе Dog должен быть void метод finalize.
3. В классах Cat и Dog не должно быть конструкторов или должны быть конструкторы без параметров.
4. Метод finalize класса Cat должен выводить на экран "Cat was destroyed".
5. Метод finalize класса Dog должен выводить на экран "Dog was destroyed".
 */
package level6.task119_lev6_lec05;

public class Cat {
    public static void main(String[] args) {

    }

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