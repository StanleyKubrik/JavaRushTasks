package javaCore.level16.task402_lev16_lec13;

import java.util.*;
import java.io.*;

public class Solution extends Thread {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new One());
        threads.add(new Two());
        threads.add(new Three());
        threads.add(new Four());
        threads.add(new Five());
    }

    public static void main(String[] args) {

    }

    public static class One extends Thread {
        @Override
        public void run() {
            while (!isInterrupted()){
            }
        }
    }

    public static class Two extends Thread {
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e){
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Three extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    public static class Four extends Thread implements Message {
        private volatile boolean keepGoing;

        public Four() {
            keepGoing = true;
        }

        @Override
        public void run() {
            while (keepGoing){
            }
        }

        @Override
        public void showWarning() {
            keepGoing = false;
        }
    }

    public static class Five extends Thread {
        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int result = 0;

                while (!isInterrupted()) { // throws IOException
                    String line = reader.readLine();
                    if (line.equals("N")) {
                        break;
                    }
                    try {
                        Integer n = Integer.parseInt(line);
                        result += n;
                    } catch (NumberFormatException e) {
                        // Ну и фиг с ним, не число и ладно, пропустим.
                    }
                }
                System.out.println(result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
