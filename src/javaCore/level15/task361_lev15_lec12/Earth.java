package javaCore.level15.task361_lev15_lec12;

public class Earth implements Planet {
    private static Earth instance;

    public static Earth getInstance() {
        if (instance == null){
            instance = new Earth();
        }
        return instance;
    }

    private Earth() {
    }
}
