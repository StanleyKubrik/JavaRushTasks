package javaSyntax.level4;

import java.io.*;

public class task64_lev4_lec4 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sN1 = reader.readLine();
        String sN2 = reader.readLine();
        String sN3 = reader.readLine();
        int a = Integer.parseInt(sN1);
        int b = Integer.parseInt(sN2);
        int c = Integer.parseInt(sN3);

        if (a == b && b == c)
            System.out.println(a + " " + b + " " + c);
         else if (b == c)
            System.out.println(b + " " + c);
         else if (a == c)
            System.out.println(a + " " + c);
         else if (a == b)
            System.out.println(a + " " + b);
    }
}
