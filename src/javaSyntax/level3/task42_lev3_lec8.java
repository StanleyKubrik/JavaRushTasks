package javaSyntax.level3;

import java.util.Date;

public class task42_lev3_lec8 {
    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour());
    }

    public static String getCountSecondsPassedInCurrentHour() {
        Date date = new Date();
        String sdate = date.toString();

        return sdate;
    }
}