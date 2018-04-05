/*
Наш кот слишком публичен!
Скрыть все внутренние переменные класса Cat, но только те, к которым остается доступ с помощью методов.


Требования:
1. Переменная name класса Cat должна быть скрыта.
2. Переменная age класса Cat должна быть скрыта.
3. Переменная weight класса Cat должна быть открыта.
4. В классе Cat должны быть 3 переменные.
5. В Cat должны быть private и public переменные.
 */
package javaCore.level11;

public class task255_lev11_lec08 {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}