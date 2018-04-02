/*
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. В классе Human должно быть 6 полей.
3. Все поля класса Human должны быть private.
4. В классе Human должно быть 10 конструкторов.
5. Все конструкторы класса Human должны быть public.
 */
package level10;

public class task241_lev10_lec11 {
    public static void main(String[] args) {

    }

    public static class Human{
        private String name;
        private int age;
        private String hair;
        private boolean sex;
        private double weight;
        private double height;

        public Human(String name, int age, String hair, boolean sex, double weight, double height){
            this.name = name;
            this.age = age;
            this.hair = hair;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
        }

        public Human(int age, String hair, boolean sex, double weight, double height){
            name = "John";
            this.age = age;
            this.hair = hair;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, String hair, boolean sex, double weight, double height){
            this.name = name;
            age = 18;
            this.hair = hair;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, int age, boolean sex, double weight, double height){
            this.name = name;
            this.age = age;
            hair = "short";
            this.sex = sex;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, int age, String hair, double weight, double height){
            this.name = name;
            this.age = age;
            this.hair = hair;
            sex = true;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, int age, String hair, boolean sex){
            this.name = name;
            this.age = age;
            this.hair = hair;
            this.sex = sex;
            weight = 70;
            height = 1.75;
        }

        public Human(String name){
            this.name = name;
            age = 18;
            hair = "blond";
            sex = true;
            weight = 75;
            height = 1.85;
        }

        public Human(String name, String hair, double weight, double height){
            this.name = name;
            age = 25;
            this.hair = hair;
            sex = false;
            this.weight = weight;
            this.height = height;
        }

        public Human(String hair, boolean sex, double weight, double height){
            name = "John";
            age = 20;
            this.hair = hair;
            this.sex = sex;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, int age, String hair){
            this.name = name;
            this.age = age;
            this.hair = hair;
            sex = true;
            weight = 50;
            height = 1.7;
        }
    }
}
