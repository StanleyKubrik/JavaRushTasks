package level4;

import java.io.*;

public class task65_lev4_lec4 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sn1 = reader.readLine();
        String sn2 = reader.readLine();
        String sn3 = reader.readLine();
        String sn4 = reader.readLine();

        int a = Integer.parseInt(sn1);
        int b = Integer.parseInt(sn2);
        int c = Integer.parseInt(sn3);
        int d = Integer.parseInt(sn4);

        if (a == b && b == c && c == d)
            System.out.println(a + " " + b + " " + c + " " + d);
        if (a >= b && a >= c && a >= d)
            System.out.println(a);
        if (b >= a && b >= c && b >= d)
            System.out.println(b);
        if (c >= a && c >= b && c >= d)
            System.out.println(c);
        if (d >= a && d >= b && d >= c)
            System.out.println(d);
    }
}
