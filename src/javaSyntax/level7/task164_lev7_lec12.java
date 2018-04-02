/*
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
6. Выведи созданные объекты на экран.
 */
package javaSyntax.level7;

public class task164_lev7_lec12 {
    public static void main(String[] args) {
        Human leonid = new Human("Leonid", true, 77);
        Human gennadiy = new Human("Gennadiy", true, 58);
        Human natalya = new Human("Natalya", false, 47);
        Human nikita = new Human("Nikita", true, 23, gennadiy, natalya);
        Human anya = new Human("Anya", false, 24);
        Human varya = new Human("Varya", false, 8, gennadiy, natalya);
        Human olesya = new Human("Olesya", false, 2, nikita, anya);
        Human kseniya = new Human("Kseniya", false, 8, nikita, anya);
        Human viktor = new Human("Viktor", true, 15, nikita, anya);

        System.out.println(leonid.toString());
        System.out.println(gennadiy.toString());
        System.out.println(natalya.toString());
        System.out.println(nikita.toString());
        System.out.println(anya.toString());
        System.out.println(varya.toString());
        System.out.println(olesya.toString());
        System.out.println(kseniya.toString());
        System.out.println(viktor.toString());
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}
