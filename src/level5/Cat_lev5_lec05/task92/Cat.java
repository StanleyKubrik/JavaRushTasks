/*
Кошачья бойня
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран c новой строки.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Нужно создать три объекта типа Cat.
3. Нужно провести три боя.
4. Программа должна вывести результат каждого боя с новой строки.
*/
package level5.Cat_lev5_lec05.task92;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", 5, 10, 75);
        Cat cat2 = new Cat("Rizhik", 7, 8, 65);
        Cat cat3 = new Cat("Murzik", 2, 12, 90);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat3.fight(cat2));
    }

    public boolean fight(Cat anotherCat){
        if ((this.age + this.strength + this.weight) > (anotherCat.age + anotherCat.strength + anotherCat.weight)){
            return true;
        } else {
            return false;
        }
    }
}