package level2;

public class task22_lev2_lec8 {
    public static void main(String[] args) {
        System.out.println(min(5, 7, 6));
        System.out.println(min(12, 89, 44));
        System.out.println(min(42, 1, 24));
        System.out.println(min(101, 232, 175));
    }

    public static int min(int a, int b, int c){
        if (a < b && a < c)
            return a;
        else if (b < a && b < c)
            return b;
        else
            return c;
    }
}