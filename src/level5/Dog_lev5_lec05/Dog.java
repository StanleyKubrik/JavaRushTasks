/*
Геттеры и сеттеры для класса Dog
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. У класса Dog должна быть переменная name с типом String.
3. У класса Dog должна быть переменная age с типом int.
4. У класса должен сеттер для переменной name.
5. У класса должен геттер для переменной name.
6. У класса должен сеттер для переменной age.
7. У класса должен геттер для переменной age.
*/
package level5.Dog_lev5_lec05;

public class Dog {
    public String name;
    public int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

    }
}