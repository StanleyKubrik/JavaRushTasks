package javaSyntax.level2;

public class task9_lev2_lec2 {

    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(41));
    }

    public static double convertCelsiumToFahrenheit(int celsium){
        double tf = 9 / 5.0 * celsium +32;

        return tf;
    }

}
