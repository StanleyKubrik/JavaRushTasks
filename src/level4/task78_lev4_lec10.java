package level4;

import java.io.*;

public class task78_lev4_lec10 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        int dig = Integer.parseInt(reader.readLine());

        while (dig > 0){
            System.out.println(str);
            dig--;
        }
        
    }
}
