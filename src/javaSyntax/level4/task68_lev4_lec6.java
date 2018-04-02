package javaSyntax.level4;

import java.io.*;

public class task68_lev4_lec6 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sage = reader.readLine();
        int age = Integer.parseInt(sage);

        if (age < 18) System.out.println(name + ", подрасти ещё");
    }
}
