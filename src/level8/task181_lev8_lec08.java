/*
20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только два метода.
4. Метод createSet() должен создавать и возвращать множество (реализация HashSet).
5. Множество из метода createSet() должно содержать 20 слов на букву «Л».
 */
package level8;

import java.util.*;

public class task181_lev8_lec08 {
    public static void main(String[] args) {
        System.out.println(createSet());
    }

    public static Set<String> createSet (){
        HashSet<String> strings = new HashSet<>();
        for (int i = 0; i < 20; i++){
            strings.add("Л" + i);
        }
        return strings;
    }
}
