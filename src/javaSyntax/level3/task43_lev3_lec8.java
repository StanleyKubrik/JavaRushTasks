package javaSyntax.level3;

public class task43_lev3_lec8 {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre){
        int metre = centimetre / 100;
        return metre;
    }
}
