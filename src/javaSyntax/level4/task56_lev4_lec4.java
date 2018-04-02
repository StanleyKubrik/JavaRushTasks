package javaSyntax.level4;

public class task56_lev4_lec4 {
    public static void main(String[] args) {
        closeToTen(7, 14);
        closeToTen(10,9);
    }

    public static void closeToTen(int a, int b){
        if (Math.abs(10-a) < Math.abs(10 -b)){
            System.out.println("Число " + a + " ближе к 10");
        } else {
            System.out.println("Число " + b + " ближе к 10");
        }
    }
}
