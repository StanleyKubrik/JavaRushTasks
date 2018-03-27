/*
LinkedList и ArrayList
Нужно создать два списка - LinkedList и ArrayList.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Программа должна содержать только три метода.
4. Метод createArrayList() должен создавать и возвращать список ArrayList.
5. Метод createLinkedList() должен создавать и возвращать список LinkedList.
 */
package level8;

import java.util.*;

public class task175_lev8_lec06 {
    public static void main(String[] args) {

    }

    public static Object createArrayList(){
        ArrayList<Object> arrayList = new ArrayList<>();
        return arrayList;
    }

    public static Object createLinkedList(){
        LinkedList<Object> linkedList = new LinkedList<>();
        return linkedList;
    }
}
