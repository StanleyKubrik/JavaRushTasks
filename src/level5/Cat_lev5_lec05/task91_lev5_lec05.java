/*
Трикотаж
Пару задач назад студенты секретного центра JavaRush создавали класс Cat. Теперь пришла пора реализовать котов во плоти, разумеется по образу и подобию класса Cat, а точнее - основываясь на нём, как на шаблоне. Их - котов - должно быть трое. Наполните этих троих жизнью, то есть, конкретными данными.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Нужно создать три объекта типа Cat.
3. Класс Cat нельзя изменять.
4. Программа не должна выводить данные на экран.
*/
package level5.Cat_lev5_lec05;

public class task91_lev5_lec05 {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", 5, 10, 75);
        Cat cat2 = new Cat("Rizhik", 7, 8, 65);
        Cat cat3 = new Cat("Murzik", 2, 12, 90);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat (String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
