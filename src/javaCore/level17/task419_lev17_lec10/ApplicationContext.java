/*
ApplicationContext
ApplicationContext будет доступен множеству нитей.
Сделать так, чтобы данные не терялись: подумай, какое ключевое слово необходимо поставить и где.


Требования:
1. Класс ApplicationContext должен быть абстрактным.
2. Класс ApplicationContext должен содержать private поле container типа Map.
3. В getByName(String name), если необходимо, используй synchronized.
4. В removeByName(String name), если необходимо, используй synchronized.
 */
package javaCore.level17.task419_lev17_lec10;

import java.util.*;

public abstract class ApplicationContext<GenericsBean extends Bean> {
    private Map<String, GenericsBean> container = new HashMap<>();
    //Map<Name, some class implemented Bean interface>


    protected ApplicationContext() {
        parseAllClassesAndInterfaces();
    }

    public synchronized GenericsBean getByName(String name) {
        return container.get(name);
    }

    public synchronized GenericsBean removeByName(String name) {
        return container.remove(name);
    }

    protected abstract void parseAllClassesAndInterfaces();

    public static void main(String[] args) {

    }
}
