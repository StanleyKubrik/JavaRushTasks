public class test {
    public static void main(String[] args) {
        String str = "#1462HD";
        System.out.println(str.matches("#\\w{6}"));

        String str1 = "12 * 33";
        System.out.println(str1.matches("-?\\d+(\\.\\d+)?\\s*[+*/\\-]\\s*-?\\d+(\\.\\d+)?"));

        String str2 = "Ivanov, Ivan";
        String[] strings = str2.split(",\\s");
        System.out.println(strings[1]);
        System.out.println(strings[0]);

        System.out.println(getDialString());
    }

    public static String getDialString(){
        String number = "+38(050)123-45-67";
        return "callto://" + number.substring(0,3) + number.substring(4,7)
                + number.substring(8,11) + number.substring(12,14)
                + number.substring(15);
    }
}