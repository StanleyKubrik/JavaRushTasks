package level4;

import java.io.*;

public class task63_lev4_lec4 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sT = reader.readLine();
        int t = Integer.parseInt(sT);

        if (t % 5 >= 1 && t % 5 <= 3 && t <= 60){
            System.out.println("Зелёный");
        } else if (t % 5 == 4 && t <= 60){
            System.out.println("Жёдтый");
        } else if (t % 5 == 5 || t % 5 == 0 && t <= 60){
            System.out.println("Красный");
        } else if (t > 60){
            System.out.println("К сожалению, в часе всего лишь 60 минут... :(");
        }
    }
}
