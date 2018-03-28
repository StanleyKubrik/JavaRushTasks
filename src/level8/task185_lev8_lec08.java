/*
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только четыре метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей.
5. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
6. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
 */
package level8;

import java.util.*;

public class task185_lev8_lec08 {
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()){
            String s = pair.getValue();
            int i = 0;
            for (Map.Entry<String, String> pair1 : copy.entrySet()){
                if (pair1.getValue().equals(s)){
                    i++;
                }
                if (i > 1)
                    removeItemFromMapByValue(map, s);
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
