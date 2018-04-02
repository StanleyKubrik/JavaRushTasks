package javaSyntax.level4;

import java.io.*;

public class task75_lev4_lec7 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sa = reader.readLine();
        String sb = reader.readLine();
        String sc = reader.readLine();
        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        int c = Integer.parseInt(sc);

        int pos = 0;
        int neg = 0;
        int dig[] = new int[3];
        dig[0] = a;
        dig[1] = b;
        dig[2] = c;
        for (int i = 0; i < dig.length; i++){
            if (dig[i] > 0)
                pos++;
            else neg++;
        }

        System.out.println("Количество положительных чисел: " + pos);
        System.out.println("Количество отрицательных чисел: " + neg);
    }
}
