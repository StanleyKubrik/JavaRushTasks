/*
Изоморфы наступают
Написать метод, который возвращает минимальное число в массиве и его позицию (индекс).


Требования:
1. Класс Solution должен содержать класс Pair.
2. Класс Solution должен содержать два метода.
3. Класс Solution должен содержать метод getMinimumAndIndex().
4. Метод getMinimumAndIndex() должен возвращать минимальное число в массиве и его позицию (индекс).
 */
package javaCore.level12;

public class task292_lev12_lec12 {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Index of minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<>(null, null);
        }

        int min = array[0];
        int ind = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
                ind = i;
            }
        }

        return new Pair<>(min, ind);
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
