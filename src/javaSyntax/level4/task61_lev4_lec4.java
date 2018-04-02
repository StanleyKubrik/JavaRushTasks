package javaSyntax.level4;

import java.util.Scanner;

public class task61_lev4_lec4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();
        int x;

        if (year % 4 == 0 && year % 400 == 0){
            x = 366;
        } else {
            x = 365;
        }

        System.out.println("Количество дней в году: " + x);
    }
}