package level4;

public class task54_lev4_lec2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat();

        System.out.println("Cats count is " + Cat.count);
    }

    public static class Cat{
        public static int count = 0;
        {
            count++;
        }
    }
}
