/*
Как-то средненько
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.


Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить среднее из трех чисел.
4. Если все числа равны, вывести любое из них.
5. Если два числа из трех равны, вывести любое из двух.
*/
package javaSyntax.level4;

import java.io.*;

public class task87_lev4_lec16 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a == b && b == c) System.out.println(a);
        else if (a == b) System.out.println(a);
        else if (a == c) System.out.println(a);
        else if (b == c) System.out.println(b);
        else if (a > b && a < c) System.out.println(a);
        else if (a < b && a > c) System.out.println(a);
        else if (b > a && b < c) System.out.println(b);
        else if (b < a && b > c) System.out.println(b);
        else if (c > b && c < a) System.out.println(c);
        else if (c < b && c > a) System.out.println(c);
    }
}
