package javaSyntax.level2;

public class task20_lev2_lec8 {

    public static void main(String[] args) {
        System.out.println(min(5, 7));
        System.out.println(min(12, 89));
        System.out.println(min(42, 1));
    }

    public static int min(int x, int y){

        if (x < y)
            return x;
        else
            return y;
    }
}



