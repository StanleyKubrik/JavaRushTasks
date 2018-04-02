package javaSyntax.level4;

import java.io.*;

public class task85_lev4_lec13 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        for (int x = 0; x < 10; x++){
            System.out.println(name + " любит меня.");
        }
    }
}