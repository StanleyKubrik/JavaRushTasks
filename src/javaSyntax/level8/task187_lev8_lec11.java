/*
Set из котов
1. Внутри класса Solution создать public static класс кот - Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
Каждый кот с новой строки.


Требования:
1. Программа должна выводить текст на экран.
2. Внутри класса Solution должен быть public static класс Cat с конструктором по умолчанию.
3. Метод createCats() класса Solution должен возвращать множество (Set) содержащее 3 кота.
4. Метод printCats() класса Solution должен вывести на экран всех котов из множества. Каждый кот с новой строки.
5. Метод main() должен один раз вызывать метод createCats().
6. Метод main() должен вызывать метод printCats().
7. Метод main() должен удалять одного кота из множества котов.
 */
package javaSyntax.level8;

import java.util.*;

public class task187_lev8_lec11 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> it = cats.iterator();
        cats.remove(it.next());
        printCats(cats);
    }

    public static class Cat {
        String name;
        public Cat(){
        }
    }

    public static Set<Cat> createCats(){
        Set<Cat> cats = new HashSet<>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cat1.name = "Murzik";
        cat2.name = "Rizhyk";
        cat3.name = "Pushistik";
        Collections.addAll(cats, cat1, cat2, cat3);
        return cats;
    }

    public static void  printCats(Set<Cat> set){
        Iterator<Cat> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
