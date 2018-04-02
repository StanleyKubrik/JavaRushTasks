/*
Время для 10 тысяч вставок
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert должен вернуть время своего исполнения в миллисекундах.


Требования:
1. Программа должна выводить числа на экран.
2. Метод main должен вызывать метод getTimeMsOfInsert только два раза.
3. Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
4. Метод getTimeMsOfInsert должен вызывать метод insert10000 только один раз.
5. Метод getTimeMsOfInsert должен вернуть время в миллисекундах, которое занимает 10 тысяч вставок в список.
 */
package javaSyntax.level8;

import java.util.*;

public class task177_lev8_lec06 {
    public static void main(String[] args) throws Exception {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static long getTimeMsOfInsert(List list) throws Exception {
        Date beforeTime = new Date();

        insert10000(list);

        Date afterTime = new Date();

        long msInsert10000 = afterTime.getTime() - beforeTime.getTime();

        return msInsert10000;
    }

    public static void insert10000(List list) throws Exception {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}