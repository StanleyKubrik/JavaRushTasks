/*
Создать класс Friend
        Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
        - Имя
        - Имя, возраст
        - Имя, возраст, пол

        Примечание:
        Имя(String), возраст(int), пол(char).


        Требования:
        1. У класса Friend должна быть переменная name с типом String.
        2. У класса Friend должна быть переменная age с типом int.
        3. У класса Friend должна быть переменная sex с типом char.
        4. У класса должен быть метод initialize, принимающий в качестве параметра имя и инициализирующий соответствующую переменную класса.
        5. У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст и инициализирующий соответствующие переменные класса.
        6. У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст, пол и инициализирующий соответствующие переменные класса.
*/
package level5.Friend_lev5_lec07.task95;

public class Friend {
    private String name;
    private int age;
    private char sex;

    public void initialize (String name){
        this.name = name;
    }

    public void initialize (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void initialize (String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
