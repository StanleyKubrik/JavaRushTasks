package javaSyntax.level3;

public class task31_lev3_lec4 {
    public static void main(String[] args) {
        //напишите тут ваш код

        for (int i = 0; i < 12; i++) {
            if (i < 10) {
                Zerg zerg = new Zerg ();
                zerg.name = "Zergey" + i;
            }

            if (i < 5) {
                Protoss prot = new Protoss();
                prot.name = "Proton" + i;
            }
            Terran tera = new Terran();
            tera.name = "Terpila" + i;
        }
    }


    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
