package javaCore.level18;

import java.io.*;

public class task444_lev18_lec11 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedInputStream file1Reader = new BufferedInputStream(new FileInputStream(file1));
        byte[] bytes1 = new byte[file1Reader.available()];
        file1Reader.close();

        BufferedInputStream file2Reader = new BufferedInputStream(new FileInputStream(file2));
        BufferedOutputStream file1Writer = new BufferedOutputStream(new FileOutputStream(file1));
        byte[] bytes2 = new byte[file2Reader.read()];
        file1Writer.write(bytes2);
        file2Reader.close();
        file1Writer.close();

        BufferedOutputStream file11Writer = new BufferedOutputStream(new FileOutputStream(file1, true));
        file11Writer.write(bytes1);
        file11Writer.close();
    }
}
