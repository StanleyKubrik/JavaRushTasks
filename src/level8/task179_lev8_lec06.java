/*
Квартет «Методы»
Реализовать 4 метода.
Каждый из них должен возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций).
Ничего измерять не нужно.


Требования:
1. Программа не должна выводить текст на экран.
2. Класс Solution должен содержать только 5 методов.
3. Метод getListForGet должен возвращать список, который лучше всего подходит для операции взятия элемента.
4. Метод getListForSet должен возвращать список, который лучше всего подходит для установки значения элемента.
5. Метод getListForAddOrInsert должен возвращать список, который лучше всего подходит для операций добавления или вставки элемента.
6. Метод getListForRemove должен возвращать список, который лучше всего подходит для операции удаления элемента.
 */
package level8;

import java.util.*;

public class task179_lev8_lec06 {
    public static List getListForGet() {
        ArrayList<Object> arrayList = new ArrayList<>();
        return arrayList;
    }

    public static List getListForSet() {
        ArrayList<Object> arrayList = new ArrayList<>();
        return arrayList;
    }

    public static List getListForAddOrInsert() {
        LinkedList<Object> linkedList = new LinkedList<>();
        return linkedList;
    }

    public static List getListForRemove() {
        LinkedList<Object> linkedList = new LinkedList<>();
        return linkedList;
    }

    public static void main(String[] args) {

    }
}
