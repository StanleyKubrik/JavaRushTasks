package level4;

public class task80_lev4_lec10 {
    public static void main(String[] args) throws Exception {
        int h = 1;
        int res;

        while (h <= 10){
            int y = 1;
            while (y <= 10){
                res = h * y;
                System.out.print(res + " ");
                y++;
            }
            System.out.println();
            h++;
        }
    }
}
