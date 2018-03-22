package level4;

import java.io.*;

public class task66_lev4_lec6 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sa = reader.readLine();
        String sb = reader.readLine();
        String sc = reader.readLine();
        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        int c = Integer.parseInt(sc);

        if (a >= b && b >= c)
            System.out.println(a + " " + b + " " + c);
        else if (a >= c && c >= b)
            System.out.println(a + " " + c + " " + b);
        else if (b >= a && a >= c)
            System.out.println(b + " " + a + " " + c);
        else if (b >= c && c >= a)
            System.out.println(b + " " + c + " " + a);
        else if (c >= a && a >= b)
            System.out.println(c + " " + a + " " + b);
        else if (c >= b && b >= a)
            System.out.println(c + " " + b + " " + a);
    }
}