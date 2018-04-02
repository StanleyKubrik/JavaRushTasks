package javaSyntax.level2;

public class task23_lev2_lec8 {
    public static int min(int a, int b, int c, int d) {
        int n = min(a, b);
        int l = min(c, d);

        if (n < l)
            return n;
        else
            return l;
    }

    public static int min(int a, int b) {
        int m;
        if (a < b)
            m = a;
        else m = b;
        return m;


    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
    }
}