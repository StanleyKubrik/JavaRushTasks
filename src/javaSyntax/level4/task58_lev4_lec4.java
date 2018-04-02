package javaSyntax.level4;

public class task58_lev4_lec4 {
    public static void main(String[] args) {
        checkSeason(5);
        checkSeason(7);
        checkSeason(9);
        checkSeason(12);
    }

    public static void checkSeason(int month){
        if (month <= 2 || month == 12){
            System.out.println("Зима");
        } else if (month >= 3 && month <= 5){
            System.out.println("Весна");
        } else if (month >= 6 && month <= 8){
            System.out.println("Лето");
        } else if (month >= 9 && month <= 11){
            System.out.println("Осень");
        } else {
            System.out.println("В году всего 12 месяцев!");
        }
    }
}
