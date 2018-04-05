/*
Родитель класса CTO
Добавь такой класс-родитель к классу CTO(технический директор), чтобы класс перестал быть абстрактным.
Добавлять/реализовывать методы в классе CTO запрещается.


Требования:
1. Класс Solution должен содержать интерфейс Businessman с методом void workHard().
2. Класс Solution должен содержать не абстрактный класс CTO.
3. Класс CTO должен реализовывать интерфейс Businessman.
4. Класс CTO не должен содержать методов.
5. Класс Solution должен содержать дополнительный класс.
6. Класс CTO должен наследоваться от дополнительного класса.
7. Дополнительный класс должен содержать один метод.
 */
package javaCore.level12;

public class task288_lev12_lec12 {
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    interface Businessman {
        void workHard();
    }

    public static class CTO extends aCTO implements Businessman {

    }

    public static class aCTO {
        public void workHard() {
        }
    }
}
