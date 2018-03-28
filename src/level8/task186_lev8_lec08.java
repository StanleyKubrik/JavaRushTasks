package level8;

import java.util.*;

public class task186_lev8_lec08 {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> people = new HashMap<>();

        people.put("Сидоров", 1250);
        people.put("Иванов", 654);
        people.put("Петров", 120);
        people.put("Сидорова", 700);
        people.put("Пеня", 350);
        people.put("Дзюба", 320);
        people.put("Колесник", 680);
        people.put("Коваленко", 910);
        people.put("Варич", 1000);
        people.put("Логачёва", 485);

        return people;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()){
            if (pair.getValue() < 500){
                map.remove(pair.getKey());
            }
        }
        // Возможно использование итератора, но у меня не получилось
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = createMap();
        for (Map.Entry<String, Integer> i : map.entrySet()){
            System.out.println(i.getValue());
        }
        System.out.println();
        removeItemFromMap(map);
        for (Map.Entry<String, Integer> i : map.entrySet()){
            System.out.println(i.getValue());
        }
    }
}
