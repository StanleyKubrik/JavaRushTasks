package level8;

import java.io.*;
import java.util.*;

public class task180_lev8_lec06 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            integers.add(i, Integer.valueOf(reader.readLine()));
        }

        int count = 1;
        int maxCount = 1;
        for (int i = 0; i < integers.size() - 1; i++){
            if (integers.get(i).equals(integers.get(i + 1)))
                count++;
                if (count > maxCount){
                    maxCount = count;
                    count = 1;
                }
        }

        System.out.println(maxCount);
    }
}