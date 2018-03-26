package level7;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> integerArrayList = new ArrayList<>(20);
        ArrayList<Integer> div3 = new ArrayList<>();
        ArrayList<Integer> div2 = new ArrayList<>();
        ArrayList<Integer> noDiv = new ArrayList<>();

        for (int i = 0; i < 20; i++){
            integerArrayList.add(Integer.parseInt(reader.readLine()));
        }

        for (Integer n:integerArrayList){
            if (n % 3 == 0) div3.add(n);
            if (n % 2 == 0) div2.add(n);
            if (n % 3 != 0 && n % 2 != 0) noDiv.add(n);
        }

        printList(div3);
        printList(div2);
        printList(noDiv);
    }

    public static void printList(List<Integer> integerList){
        for (int x = 0; x < 20; x++){
            System.out.println(integerList.get(x));
        }
    }
}
