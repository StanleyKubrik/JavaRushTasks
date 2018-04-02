package javaSyntax.level3;

public class task28_lev3_lec3 {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(15, 1.13));
        System.out.println(convertEurToUsd(100, 1.13));
    }

    public static double convertEurToUsd(int eur, double course){
        double usa = eur * course;
        return usa;
    }
}