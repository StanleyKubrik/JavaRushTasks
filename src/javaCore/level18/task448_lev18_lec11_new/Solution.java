package javaCore.level18.task448_lev18_lec11_new;

import java.io.*;
import java.util.*;

public class Solution {
    static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        while (!str.equals("exit")){
            ReadThread rt = new ReadThread(str);
            rt.start();
            str = reader.readLine();
        }
    }

    public static class ReadThread extends Thread{
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try {
                BufferedInputStream fileReader = new BufferedInputStream(new FileInputStream(fileName));
                Map<Integer, Integer> countMap = new HashMap<>();

                int maxVal = Integer.MIN_VALUE;
                int maxKey = 0;
                while (fileReader.available() > 0){
                    int key = fileReader.read();
                    if (countMap.containsKey(key)){
                        int value = countMap.get(key) + 1;
                        countMap.replace(key, value);
                        if (value > maxVal){
                            maxVal = value;
                            maxKey = key;
                        }
                    } else {
                        countMap.put(key, 1);
                    }
                }
                fileReader.close();

                resultMap.put(fileName, maxKey);
            } catch (IOException e){
                System.out.println(e);
            }
        }
    }
}
