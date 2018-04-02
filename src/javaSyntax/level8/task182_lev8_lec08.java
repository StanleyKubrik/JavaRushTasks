/*
Больше 10? Вы нам не подходите
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createSet() должен создавать и возвращать множество HashSet состоящих из 20 различных чисел.
5. Метод removeAllNumbersMoreThan10() должен удалять из множества все числа больше 10.
 */
package javaSyntax.level8;

import java.util.*;

public class task182_lev8_lec08 {
    public static HashSet<Integer> createSet() throws Exception {
        HashSet<Integer> integerHashSet = new HashSet<>();

        for (int i = 0; i < 20; i++){
            integerHashSet.add(i);
        }
        return integerHashSet;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) throws Exception {
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            int i = it.next();
            if (i > 10)
                it.remove();
        }
        return set;
    }

    public static void main(String[] args) throws Exception {

    }
}
