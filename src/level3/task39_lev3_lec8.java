/*
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

String name = reader.readLine();
String sAge = reader.readLine();
int nAge = Integer.parseInt(sAge);
*/

package level3;

import java.io.*;

public class task39_lev3_lec8 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sAge = reader.readLine();
        String name = reader.readLine();
        int nAge = Integer.parseInt(sAge);

        System.out.println(name + " захватит мир через " + nAge + " лет. Му-ха-ха!");
    }
}
