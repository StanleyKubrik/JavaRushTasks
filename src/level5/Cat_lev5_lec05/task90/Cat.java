/*
Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.

Должно выполняться условие:
если cat1.fight(cat2) = true,
то cat2.fight(cat1) = false


Требования:
1. Класс Cat должен содержать конструктор без параметров.
2. Класс Cat должен содержать публичные поля name, age, weight и strength.
3. Метод fight не должен считывать данные с клавиатуры.
4. Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
5. Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
6. Метод fight не должен выводить данные на экран.
*/
package level5.Cat_lev5_lec05.task90;

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Rizhiy";
        cat1.age = 20;
        cat1.weight = 50;
        cat1.strength = 50;
        Cat cat2 = new Cat();
        cat1.name = "Murzik";
        cat2.age = 35;
        cat2.weight = 40;
        cat2.strength = 25;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }

    public boolean fight(Cat anotherCat){
        if ((this.age + this.weight + this.strength) > (anotherCat.age + anotherCat.weight + anotherCat.strength)){
            return true;
        } else {
            return false;
        }
    }
}
