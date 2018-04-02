package javaSyntax.level4;

import java.io.*;

public class task70_lev4_lec6 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sa = reader.readLine();
        String sb = reader.readLine();
        String sc = reader.readLine();
        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        int c = Integer.parseInt(sc);

        if (a == b && a != c) System.out.println(3);
        else if (a == c && b != a) System.out.println(2);
        else if (b == c && b != a) System.out.println(1);
    }
}