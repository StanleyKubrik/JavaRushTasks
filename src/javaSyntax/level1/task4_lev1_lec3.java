package javaSyntax.level1;

import java.util.Scanner;

public class task4_lev1_lec3 {
    public static void main(String[] args) {
        System.out.print("Введите целое число: ");
        Scanner s = new Scanner(System.in);
        int dig = s.nextInt();
        System.out.println("Квадрат введёного числа: " + dig * dig);
    }
}