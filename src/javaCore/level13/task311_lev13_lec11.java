package javaCore.level13;

import java.io.*;

public class task311_lev13_lec11 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        try {
            String s;
            while (true){
                s = reader.readLine();
                writer.write(s);
                if(s.equals("exit")){
                    writer.write(s);
                    break;
                }
            }
        } catch (IOException e) {

        }
    }
}
