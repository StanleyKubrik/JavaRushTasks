/*
Класс StringHelper
Сделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) - возвращает строку повторенную count раз.
String multiply(String s) - возвращает строку повторенную 5 раз.

Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго


Требования:
1. Методы класса StringHelper должны возвращать строку.
2. Методы класса StringHelper должны быть статическими.
3. Методы класса StringHelper должны быть public.
4. Метод multiply(String s, int count) должен возвращать строку повторенную count раз.
5. Метод multiply(String s) должен возвращать строку повторенную 5 раз.
 */
package level6.task127_lev6_lec08;

public class StringHelper {
    public static void main(String[] args) {
        System.out.println(multiply("Amigo", 4));
        System.out.println(multiply("Amigo"));
    }

    public static String multiply(String s, int count){
        String result = s;
        String r = result;
        for (int x = 1; x < count; x++){
            result = result + r;
        }
        return result;
    }

    public static String multiply(String s){
        String result = s;
        String r = result;
        for (int x = 1; x < 5; x++){
            result = result + r;
        }
        return result;
    }
}
