package javaSyntax.level3;

public class task34_lev3_lec4 {
    public static void main(String[] args) {
        System.out.println(getVolume(25,5,2));
    }

    public static long getVolume(int a, int b, int c){
        long V = a * b * c * 1000;
        return V;
    }
}
