/*
Р или Л
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву "р"
2.2. удваивать все слова содержащие букву "л".
2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
2.4. с другими словами ничего не делать.

Пример:
роза
лира
лоза

Выходные данные:
лира
лоза
лоза


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Метод fix должен удалять из списка строк все слова, содержащие букву «р». Исключение: слова содержащие и букву «р» и букву «л» - их нужно оставить.
3. Метод fix должен удваивать слова, содержащие букву «л» (добавлять еще один элемент с этим словом). Исключение: слова содержащие и букву «л» и букву «р» - их не нужно удваивать.
4. Метод fix не должен ничего делать со словами, содержащими и букву «л» и букву «р».
5. Метод fix не должен ничего делать со словами, которые не содержат ни букву «л», ни букву «р».
 */
package javaSyntax.level7;

import java.util.*;

public class task156_lev7_lec09 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list.add("кура");
        list.add("лувр");
        list.add("лень");
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("р") && list.get(i).contains("л")) {
                list.set(i, list.get(i));
            }
            else if (list.get(i).contains("л")) {
                list.add(i, list.get(i));
                i++;
            }
            else if (list.get(i).contains("р")) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}