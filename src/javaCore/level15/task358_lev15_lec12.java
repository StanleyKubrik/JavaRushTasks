package javaCore.level15;

import java.io.*;

public class task358_lev15_lec12 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = "";
        try {
            while (true) {
                if (s.equals("exit")) break;
                s = reader.readLine();
                int i = Integer.parseInt(s);
                if (s.contains(".")) print(Double.parseDouble(s));
                else if (i > 0 && i < 128) print(Short.parseShort(s));
                else if (i <= 0 || i >= 128) print(i);
            }
        } catch (NumberFormatException e) {
            print(s);
        }

        reader.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
