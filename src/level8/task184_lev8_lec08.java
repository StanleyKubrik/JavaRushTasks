/*
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
4. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
 */
package level8;

import java.util.*;

public class task184_lev8_lec08 {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<>();

        map.put("Stallone", new Date("MAY 26 1995"));
        map.put("Дзюба", new Date("OCT 3 1970"));
        map.put("Головин", new Date("NOV 25 1984"));
        map.put("Иванов", new Date("JUL 18 1999"));
        map.put("Сидоров", new Date("AUG 31 1994"));
        map.put("Петров", new Date("APR 1 1972"));
        map.put("Кармазин", new Date("APR 8 1980"));
        map.put("Антонов", new Date("JAN 12 1941"));
        map.put("Сергеев", new Date("SEPT 9 1978"));
        map.put("Пупкин", new Date("JUNE 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        /*
        for (Map.Entry<String, Date> i : createMap().entrySet()){
            if (i.getValue().getMonth() > 4 && i.getValue().getMonth() < 8){
                createMap().remove(i.getKey());
            }
        }
        */

        for (Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator(); it.hasNext();){
            Date date = it.next().getValue();
            if (date.getMonth() > 4 && date.getMonth() < 8) {
                it.remove();
            }
        }

        /*
        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, Date> date = it.next();
            if (date.getValue().getMonth() > 5 && date.getValue().getMonth() < 9)
                it.remove();
        }
        */
    }

    public static void main(String[] args) {
        /*
        System.out.println();
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);

        for (Map.Entry<String, Date> i : createMap().entrySet()){
            System.out.println(i.getValue());
        }
        */
        HashMap<String, Date> map = createMap();
        for (Map.Entry<String, Date> i : map.entrySet()) {
            System.out.println(i.getValue());
        }
        removeAllSummerPeople(map);
        System.out.println();
        for (Map.Entry<String, Date> i : map.entrySet()) {
            System.out.println(i.getValue());
        }
    }
}

