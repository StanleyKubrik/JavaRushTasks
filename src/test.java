public class test {
    public static void main(String[] args) {
        String str = "#1462HD";
        System.out.println(str.matches("#\\w{6}"));

        String str1 = "12 * 33";
        System.out.println(str1.matches("-?\\d+(\\.\\d+)?\\s*[+*/\\-]\\s*-?\\d+(\\.\\d+)?"));
    }
}