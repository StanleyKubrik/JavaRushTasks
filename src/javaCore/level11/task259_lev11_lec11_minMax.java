/*
Минимакс
Написать метод, который возвращает минимальное и максимальное числа в массиве.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Допиши реализацию метода getMinimumAndMaximum, он должен возвращать пару из минимума и максимума.
3. Метод main не изменять.
4. Программа должна вывести правильный результат.
5. Метод main должен вызывать метод getMinimumAndMaximum.
 */
package javaCore.level11;

import java.util.*;

public class task259_lev11_lec11_minMax {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<>(null, null);
        }

        Arrays.sort(array);

        int min = array[0];
        int max = array[array.length - 1];

        return new Pair<>(min, max);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
