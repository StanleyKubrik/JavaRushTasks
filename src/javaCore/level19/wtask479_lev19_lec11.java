package javaCore.level19;

import java.io.*;
import java.util.*;

public class wtask479_lev19_lec11 {
    public static List<LineItem> lines = new ArrayList<>();
    private static int file1count = 0;
    private static int file2count = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader fileReader1 = new BufferedReader(new FileReader(file1));
        List<String> list1 = new ArrayList<>();
        while (fileReader1.ready()){
            list1.add(fileReader1.readLine());
        }
        fileReader1.close();

        BufferedReader fileReader2 = new BufferedReader(new FileReader(file2));
        List<String> list2 = new ArrayList<>();
        while (fileReader2.ready()){
            list2.add(fileReader2.readLine());
        }
        fileReader2.close();

        try {
            for (int i = 0; i < list1.size() - 1; i++) {
                if (list1.get(i).equals(list2.get(i))) {
                    lines.add(new LineItem(Type.SAME, list1.get(i)));
                    list2.remove(0);
                } else {
                    if (list1.get(i).equals(list2.get(i + 1))) {
                        lines.add(new LineItem(Type.ADDED, list2.get(i + 1)));
                        list2.remove(0);
                    } else {
                        lines.add(new LineItem(Type.REMOVED, list1.get(i)));
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
            if (list1.size() > list2.size()) {
                for (int i = list2.size() - 1; i < list1.size() - 1; i++) {
                    lines.add(new LineItem(Type.REMOVED, list1.get(i)));
                }
            } else {
                for (int i = list1.size() - 1; i < list2.size() - 1; i++) {
                    lines.add(new LineItem(Type.ADDED, list2.get(i)));
                }
            }
        }

        /*for (LineItem s : lines) {
            System.out.println(s.type + " " + s.line);
        }*/
    }

    public enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
