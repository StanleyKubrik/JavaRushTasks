/*
Играем в Jолушку
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.


Требования:
1. Объяви и сразу проинициализируй 4 переменных типа ArrayList (список целых чисел). Первый список будет главным, а остальные - дополнительными.
2. Считать 20 чисел с клавиатуры и добавить их в главный список.
3. Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
4. Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
5. Добавить в третий дополнительный список все остальные числа из главного.
6. Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
7. Программа должна вывести три дополнительных списка, используя метод printList.
 */
package level7;

import java.io.*;
import java.util.*;

public class task153_lev7_lec09 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> integerArrayList = new ArrayList<>(20);
        ArrayList<Integer> div3 = new ArrayList<>();
        ArrayList<Integer> div2 = new ArrayList<>();
        ArrayList<Integer> noDiv = new ArrayList<>();

        for (int i = 0; i < 20; i++){
            integerArrayList.add(Integer.parseInt(reader.readLine()));
        }

        for (Integer n:integerArrayList){
            if (n % 3 == 0) div3.add(n);
            if (n % 2 == 0) div2.add(n);
            if (n % 3 != 0 && n % 2 != 0) noDiv.add(n);
        }

        printList(div3);
        printList(div2);
        printList(noDiv);
    }

    public static void printList(List<Integer> integerList){
        for (int x = 0; x < 20; x++){
            System.out.println(integerList.get(x));
        }
    }
}
