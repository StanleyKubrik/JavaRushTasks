package javaCore.level16;

import java.io.*;
import java.nio.file.*;

public class task400_lev16_lec13 {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileContent;
        private String filename;

        @Override
        public void setFileName(String fullFileName) {
            filename = fullFileName;
        }

        @Override
        public String getFileContent() {
            if (!currentThread().isInterrupted()){
                return " ";
            } else {
                return fileContent;
            }
        }

        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));
                // создаем reader типа буфера новый буфер для чтения
                // (из нового файла для чтения(с новым файлом (имя которого)))
                while (reader.ready()) // пока в reader'е есть что читать
                {
                    fileContent += reader.readLine() + " "; // дописываем строку к filecontent и + пробел
                }
                reader.close(); // закрываем этот ридер
            } catch (IOException e) {
                e.printStackTrace();
            }

            /* Alternative solution!
            try (BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)))){
               String str;
               while ((str=reader.readLine())!=null){
                   fileContent+=str+" ";
               }
               reader.close();
           } catch (IOException e) {
               System.out.println("ошибка");
           }
             */
        }
    }
}
