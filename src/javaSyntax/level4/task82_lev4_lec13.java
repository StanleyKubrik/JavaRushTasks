package javaSyntax.level4;

import java.io.*;

public class task82_lev4_lec13 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        for (int x = 0; x < m; x++){
            for (int y = 0; y < n; y++){
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
