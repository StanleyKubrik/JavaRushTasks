package javaSyntax.level4;

public class task50_lev4_lec2 {
    private String name = "Рыжик";

    public static void main(String[] args) {
        task50_lev4_lec2 cat = new task50_lev4_lec2();
        cat.setName("Мурзик");
        System.out.println(cat.name);
    }

    public void setName(String name){
        this.name = name;
    }
}
