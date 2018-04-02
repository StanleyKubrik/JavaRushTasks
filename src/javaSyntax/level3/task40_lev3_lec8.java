package javaSyntax.level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task40_lev3_lec8 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String ssalary = reader.readLine();
        String syear = reader.readLine();
        int year = Integer.parseInt(syear);
        int salary = Integer.parseInt(ssalary);

        System.out.println(name + " получает " + salary + " через " + year + " лет." );
    }
}
