/*
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.


Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
 */
package level8;

import java.util.*;

public class task192_lev8_lec11_hard {
    public static void main(String[] args) {
        ArrayList<Human> children1 = new ArrayList<>();
        ArrayList<Human> children2 = new ArrayList<>();
        ArrayList<Human> children3 = new ArrayList<>();

        Human gFather1 = new Human("Viktor", true, 70, children1);
        Human gMother1 = new Human("Eva", false, 67, children1);
        Human mother = new Human("Irina", false, 35, children3);
        children1.add(mother);

        Human gFather2 = new Human("Ignat", true, 77, children2);
        Human gMother2 = new Human("Katya", false, 72, children2);
        Human father = new Human("Grisha", true, 38, children3);
        children2.add(father);

        Human ch1 = new Human("Vasya", true, 14);
        Human ch2 = new Human("Anya", false, 23);
        Human ch3 = new Human("Igor", true, 18);
        Collections.addAll(children3, ch1, ch2, ch3);

        ArrayList<Human> family = new ArrayList<>();
        family.add(gFather1);
        family.add(gFather2);
        family.add(gMother1);
        family.add(gMother2);
        family.add(father);
        family.add(mother);
        family.add(ch1);
        family.add(ch2);
        family.add(ch3);

        for (int i = 0; i < family.size(); i++){
            System.out.println(family.get(i));
        }
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;

        ArrayList<Human> children = new ArrayList<>();

        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
