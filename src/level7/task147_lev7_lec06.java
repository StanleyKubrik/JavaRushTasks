/*
Что за список такой?
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.


Требования:
1. Программа не должна ничего считывать с клавиатуры.
2. Объяви переменную типа ArrayList (список строк) и сразу проинициализируй ee.
3. Программа должна добавить 5 любых строк в список.
4. Программа должна вывести размер списка на экран.
5. Программа должна вывести содержимое списка на экран, каждое значение с новой строки.
 */
package level7;

import java.util.ArrayList;

public class task147_lev7_lec06 {
    public static void main(String[] args) {
        ArrayList<String> strArr = new ArrayList<>();

        strArr.add("One");
        strArr.add("Two");
        strArr.add("Three");
        strArr.add("Four");
        strArr.add("Five");

        System.out.println(strArr.size());
        for (String s:strArr){
            System.out.println(s);
        }
    }
}
