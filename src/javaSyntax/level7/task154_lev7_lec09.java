/*
Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.


Требования:
1. Объяви переменную типа ArrayList (список строк) и сразу проинициализируй ee.
2. Считай 5 строк с клавиатуры и добавь их в список.
3. Удали третий элемент массива.
4. Выведи элементы на экран, каждый с новой строки.
5. Порядок вывода должен быть обратный.
 */
package javaSyntax.level7;

import java.util.*;
import java.io.*;

public class task154_lev7_lec09 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            stringArrayList.add(reader.readLine());
        }

        stringArrayList.remove(2);

        for (int i = 3; i >= 0; i--){
            System.out.println(stringArrayList.get(i));
        }
    }
}
