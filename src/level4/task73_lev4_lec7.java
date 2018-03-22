package level4;

import java.io.*;

public class task73_lev4_lec7 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sa = reader.readLine();
        int a = Integer.parseInt(sa);
        int num = (int) Math.log10(a) + 1;

        if (a >= 1 && a <= 999) {
            if (a % 2 == 0 && num == 1) System.out.println("Чётное однозначное число");
            else if (a % 2 != 0 && num == 1) System.out.println("Нечётное однозначное число");
            else if (a % 2 == 0 && num == 2) System.out.println("Чётное двузначное число");
            else if (a % 2 != 0 && num == 2) System.out.println("Нечётное двузначное число");
            else if (a % 2 == 0 && num == 3) System.out.println("Чётное трёхзначное число");
            else if (a % 2 != 0 && num == 3) System.out.println("Нечётное трёхзначное число");
        }
    }
}