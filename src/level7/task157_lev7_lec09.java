/*
Удваиваем слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Выведи результат на экран, каждое значение с новой строки.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 10 строк с клавиатуры и добавь их в список.
3. Метод doubleValues должен удваивать элементы списка по принципу a,b,c -> a,a,b,b,c,c..
4. Выведи получившийся список на экран, каждый элемент с новой строки.
 */
package level7;

import java.io.*;
import java.util.*;

public class task157_lev7_lec09 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            stringArrayList.add(i, reader.readLine());
        }

        ArrayList<String> result = doubleValues(stringArrayList);

        for (String s:result){
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> stringList){
        for (int i = 0; i < stringList.size(); i++){
            stringList.add(i, stringList.get(i));
            i++;
        }
        return stringList;
    }
}
