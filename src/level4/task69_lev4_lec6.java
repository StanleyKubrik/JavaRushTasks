package level4;

import java.io.*;

public class task69_lev4_lec6 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sage = reader.readLine();
        int age = Integer.parseInt(sage);

        if (age > 20) System.out.println("И 18-ти достаточно");
    }
}