/*
Время для 10 тысяч вызовов get
Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getTimeMsOfGet должен вернуть время своего исполнения в миллисекундах.


Требования:
1. Программа должна выводить числа на экран.
2. Метод main должен вызывать метод getTimeMsOfGet только два раза.
3. Метод main должен вызывать метод fill только два раза.
4. Метод fill(List list) должен вставлять 10 тысяч элементов в список.
5. Метод get10000(List list) должен производить 10 тысяч вызовов get для списка.
6. Метод getTimeMsOfGet должен вызывать метод get10000(List list) только один раз.
7. Метод getTimeMsOfGet должен вернуть время в миллисекундах, которое занимает 10 тысяч вызовов get для списка.
 */
package javaSyntax.level8;

import java.util.*;

public class task178_lev8_lec06 {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfGet(fill(new ArrayList())));
        System.out.println(getTimeMsOfGet(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getTimeMsOfGet(List list) {
        Date beforeTime = new Date();

        get10000(list);

        Date afterTime = new Date();
        long msGet10000 = afterTime.getTime() - beforeTime.getTime();
        return msGet10000;
    }

    public static void get10000(List list) {
        if (list.isEmpty()) return;
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}
