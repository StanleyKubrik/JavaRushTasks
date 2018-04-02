package javaSyntax.level2;

public class task18_lev2_lec5 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman woman = new Woman();

        cat.owner = new Woman();
        dog.owner = new Woman();
        fish.owner = new Woman();
    }

    public static class Cat{
        public Woman owner;
    }

    public static class Dog{
        public Woman owner;
    }

    public static class Fish{
        public Woman owner;
    }

    public static class Woman{
    }

}
