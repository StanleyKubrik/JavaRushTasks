/*
Продолжаем мыть раму
1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Объяви переменную типа список строк и сразу проинициализируй ee.
3. Добавь в список слова: «мама», «мыла», «раму».
4. После каждого слова добавь в список строку, содержащую слово «именно».
5. Выведи элементы списка на экран, каждый с новой строки.
 */
package javaSyntax.level7;

import java.util.*;

public class task155_lev7_lec09 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        Collections.addAll(stringArrayList, "мама", "мыла", "раму");

        stringArrayList.add(1, "именно");
        stringArrayList.add(3, "именно");
        stringArrayList.add(5, "именно");

        for (String s:stringArrayList){
            System.out.println(s);
        }
    }
}
