package level3;

import java.io.*;

public class task45_lev3_lec8 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String name1 = reader.readLine();
            String name2 = reader.readLine();
            String name3 = reader.readLine();

            System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
