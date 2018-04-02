/*
Проверка на упорядоченность
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 10 строк с клавиатуры и добавь их в список.
3. Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
4. Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
 */
package javaSyntax.level7;

import java.util.*;
import java.io.*;

public class task158_lev7_lec09 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> stringArrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            stringArrayList.add(i, reader.readLine());
        }

        for (int i = 0; i < 9;){
            if (stringArrayList.get(i).length() > stringArrayList.get(i + 1).length()) {
                System.out.println(i + 1);
                break;
            } else i++;
        }

        /*
        int x = 0;
        for (int i = 1; i < stringArrayList.size();) {
            if (stringArrayList.get(i).length() <= stringArrayList.get(i + 1).length()) {
                i++;
            } else {
                System.out.println(i + 1);
                break;
            }
        }
        */
    }
}
