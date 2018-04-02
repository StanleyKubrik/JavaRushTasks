package javaSyntax.level4;

import java.io.*;

public class task67_lev4_lec6 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = reader.readLine();
        String name2 = reader.readLine();

        boolean eq = name1.equals(name2);

        if (eq == true) System.out.println("Имена идентичны");
        else if (name1.length() == name2.length()) System.out.println("Длины имён равны");
    }
}
