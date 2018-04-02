package javaSyntax.level4;

public class task53_lev4_lec2 {
    private String fullName;

    public static void main(String[] args) {
        task53_lev4_lec2 name = new task53_lev4_lec2();

        System.out.println(name.setName("Nikita", "Sukhonosov"));
    }

    private String setName(String firstName, String lastName){
        String fullName = firstName + " " + lastName;
        this.fullName = fullName;
        return this.fullName;
    }
}