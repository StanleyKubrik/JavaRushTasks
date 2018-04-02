/*
Исключение при работе с коллекциями Map
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
HashMap<String, String> map = new HashMap<String, String>(null);
map.put(null, null);
map.remove(null);


Требования:
1. Программа должна выводить сообщение на экран.
2. В программе должен быть блок try-catch.
3. Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
4. Выведенное сообщение должно содержать тип возникшего исключения.
5. Имеющийся код в методе main не удалять.
 */
package javaSyntax.level9.exception;

import java.util.*;

public class task209_lev9_lec06 {
    public static void main(String[] args) throws Exception {
        try {
            HashMap<String, String> map = new HashMap<>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
    }
}
