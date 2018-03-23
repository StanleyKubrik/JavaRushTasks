/*
Программист создает человека
Создать class Person. У человека должно быть имя String name, возраст int age.
Добавь метод initialize(String name, int age), в котором проинициализируй переменные name и age.
В методе main создай объект Person, занеси его ссылку в переменную person.
Вызови метод initialize с любыми значениями.


Требования:
1. Класс Solution должен содержать класс Person.
2. У класса Person должна быть переменная name с типом String.
3. У класса Person должна быть переменная age с типом int.
4. У класса Person должен быть метод initialize, принимающий в качестве параметра имя, возраст и инициализирующий соответствующие переменные класса.
5. Необходимо создать объект типа Person.
6. Необходимо вызвать метод initialize у созданного объекта и передать в него какие-либо параметры.
*/
package level5.Person_lev5_lec05.task100_lev5_lec07;

public class task100_lev5_lec07 {
    static class Person {
        private String name;
        private int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Dmitriy", 35);
    }
}
