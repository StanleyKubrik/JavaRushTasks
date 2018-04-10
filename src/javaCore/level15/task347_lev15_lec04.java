/*
ООП - Перегрузка - убираем лишнее
1. Подумайте, какая из реализаций метода print будет вызвана.
2. Удалите все лишние реализации метода print.


Требования:
1. В классе Solution кроме метода main должен остаться только один метод print(с правильным параметром!).
2. Метод print должен быть публичным.
3. Метод print должен быть статическим.
4. Программа должна выводить на экран строку "Я буду Java прогером!".
 */
package javaCore.level15;

public class task347_lev15_lec04 {
    public static void main(String[] args) {
        print(1);
    }

    public static void print(long d) {
        System.out.println("Я буду Java прогером!");
    }
}
