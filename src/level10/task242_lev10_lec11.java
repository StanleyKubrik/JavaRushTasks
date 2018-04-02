/*
Расставьте минимум static-ов
Расставьте как можно меньше модификаторов static так, чтобы пример скомпилировался.


Требования:
1. В классе должна быть переменная A.
2. В классе должна быть переменная B.
3. В классе должна быть переменная C.
4. В классе должна быть переменная D.
5. Метод main не изменять.
6. Метод getA не изменять.
 */
package level10;

public class task242_lev10_lec11 {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        task242_lev10_lec11 solution = new task242_lev10_lec11();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        task242_lev10_lec11.D = 5 * D * C;

        task242_lev10_lec11.D = 5;
    }

    public int getA() {
        return A;
    }
}
