/*
Одинаковые слова в списке
Ввести с клавиатуры в список 20 слов.
Нужно подсчитать сколько раз каждое слово встречается в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр - уникальная строка, а второй - число, сколько раз данная строка встречалась в списке.

Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.


Требования:
1. Метод countWords должен объявлять и инициализировать HashMap с типом элементов .
2. Метод countWords должен возвращать созданный словарь.
3. Метод countWords должен добавлять в словарь ключи, соответствующие уникальным словам, и значения по этим ключам, отображающие сколько раз встречалось слово.
4. Программа должна выводить на экран полученный словарь.
5. Метод main должен вызывать метод countWords.
 */
package level10;

import java.io.*;
import java.util.*;

public class task244_lev10_lec11 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<>();
        for (int i = 0; i < list.size(); i++){
            int count = 0;
            for (int j = 0; j < list.size(); j++){
                if (list.get(i).equals(list.get(j))){
                    count++;
                }
            }
            result.put(list.get(i), count);
        }
        return result;
    }
}
