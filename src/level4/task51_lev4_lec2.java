package level4;

public class task51_lev4_lec2 {
    private static int catsCount = 0;

    public static void main(String[] args) {
        task51_lev4_lec2.addNewCat();
        task51_lev4_lec2.addNewCat();
        System.out.println(catsCount);
    }

    public static void addNewCat(){
        catsCount++;
    }
}
