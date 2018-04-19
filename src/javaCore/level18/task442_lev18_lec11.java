package javaCore.level18;

import java.io.*;

public class task442_lev18_lec11 {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream(args[0]);
        int symb = file.available();
        int space = 0;

        while (file.available() > 0){
            if (file.read() == 32){
                space++;
            }
        }
        file.close();

        float rez = (float) space / symb * 100;
        System.out.println(rez);
    }
}
