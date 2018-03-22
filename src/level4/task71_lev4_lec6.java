package level4;

import java.io.*;

public class task71_lev4_lec6 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sa = reader.readLine();
        String sb = reader.readLine();
        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);

        if (a > 0 && b > 0) System.out.println("1");
        else if (a < 0 && b > 0) System.out.println("2");
        else if (a < 0 && b < 0) System.out.println("3");
        else if (a > 0 && b < 0) System.out.println("4");
    }
}