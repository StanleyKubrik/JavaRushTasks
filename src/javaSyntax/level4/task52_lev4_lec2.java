package javaSyntax.level4;

public class task52_lev4_lec2 {
    private static int catsCount = 0;

    public static void main(String[] args) {
        setCatsCount(15);
        System.out.println(catsCount);
        setCatsCount(23);
        System.out.println(catsCount);
    }

    public static void setCatsCount(int catsCount) {
        task52_lev4_lec2.catsCount = catsCount;
    }
}
