package level4;

import java.io.*;

public class task74_lev4_lec7 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sa = reader.readLine();
        String sb = reader.readLine();
        String sc = reader.readLine();
        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        int c = Integer.parseInt(sc);

        int count = 0;
        if (a > 0) count++;
        if (b > 0) count++;
        if (c > 0) count++;

        System.out.println(count);

        /*
        int count = 0;
        int dig[] = new int[3];
        dig[0] = a;
        dig[1] = b;
        dig[2] = c;
        for (int i = 0; i < dig.length; i++){
            if (dig[i] > 0) count++;
        }
        System.out.println(count);
        */
    }
}
