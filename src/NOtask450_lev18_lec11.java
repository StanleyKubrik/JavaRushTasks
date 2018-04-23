package javaCore.level18;

import java.io.*;
import java.util.*;

public class NOtask450_lev18_lec11 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        //BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(fileName));
        Set<String> files = new TreeSet<>();

        fileName = reader.readLine();
        System.out.println(fileName.lastIndexOf(".part"));

        /*while (!(fileName = reader.readLine()).equals("end")){
            files.add(fileName);
        }*/

        /*for (String s : files){
            BufferedInputStream fileReader = new BufferedInputStream(new FileInputStream(s));
            while (fileReader.available() > 0){
                *//*byte[] bytes = new byte[fileReader.available()];
                fileReader.read(bytes);
                writer.write(bytes);*//*
                writer.write(fileReader.read());
            }
            fileReader.close();
        }
        writer.close();*/

        /*for (String s : files){
            System.out.println(s);
        }*/
    }
}
