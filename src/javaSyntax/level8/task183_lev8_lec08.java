/*
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
 */
package javaSyntax.level8;

import java.util.*;

public class task183_lev8_lec08 {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> people = new HashMap<>();
        people.put("Сидоров", "Никита");
        people.put("Иванов", "Гена");
        people.put("Петров", "Наташа");
        people.put("Сидорова", "Варвара");
        people.put("Пеня", "Дима");
        people.put("Дзюба", "Дима");
        people.put("Колесник", "Дима");
        people.put("Коваленко", "Антон");
        people.put("Варич", "Дима");
        people.put("Логачёва", "Татьяна");

        return people;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (HashMap.Entry<String, String> i : map.entrySet()){
            if (i.getKey().equals(name))
                count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (HashMap.Entry<String, String> i : map.entrySet()){
            if (i.getValue().equals(lastName))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        /*
        HashMap<String, String> map = createMap();
        int a = getCountTheSameLastName(map, "Дима");
        System.out.println(a);
        System.out.println(getCountTheSameLastName(createMap(), "Дима"));
        System.out.println(getCountTheSameFirstName(createMap(), "Сухоногов"));
        */
    }
}
