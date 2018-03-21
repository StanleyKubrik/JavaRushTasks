package level4;

public class task57_lev4_lec4 {
    public static void main(String[] args) {
        checkInterval(33);
        checkInterval(88);
    }

    public static void checkInterval(int a){
        if (a > 50 && a < 100){
            System.out.println("Число " + a + " содержится в интервале.");
        } else {
            System.out.println("Число " + a + " не содержится в интервале.");
        }
    }
}
