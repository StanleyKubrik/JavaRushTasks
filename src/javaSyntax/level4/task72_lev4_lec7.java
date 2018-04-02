package javaSyntax.level4;

import java.io.*;

public class task72_lev4_lec7 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sa = reader.readLine();
        int a = Integer.parseInt(sa);

        if (a < 0 && a % 2 == 0) System.out.println("Отрицительное чётное число");
        else if (a < 0 && a % 2 != 0) System.out.println("Отрицительное нечётное число");
        else if (a == 0) System.out.println("Ноль");
        else if (a > 0 && a % 2 == 0) System.out.println("Положительное чётное число");
        else if (a > 0 && a % 2 != 0) System.out.println("Положительное нечётное число");
    }
}