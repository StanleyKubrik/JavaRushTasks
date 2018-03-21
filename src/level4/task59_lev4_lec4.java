package level4;

import java.util.Scanner;

public class task59_lev4_lec4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int dig = in.nextInt();

        if (dig > 0){
            dig *= 2;
        } else if (dig < 0){
            dig += 1;
        } else {
            dig = 0;
        }

        System.out.println(dig);
    }
}
