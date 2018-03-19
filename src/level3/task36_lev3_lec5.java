package level3;

public class task36_lev3_lec5 {
    public static void main(String[] args) {
        System.out.println(convertToSeconds(24));
        System.out.println(convertToSeconds(48));
    }

    public static int convertToSeconds(int  hour){
        int seconds = hour * 3600;
        return seconds;
    }
}
