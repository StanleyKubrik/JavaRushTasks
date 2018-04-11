package javaCore.level15.task361_lev15_lec12;

public class Sun implements Planet {
    private static Sun instance;

    public static Sun getInstance() {
        if (instance == null){
            instance = new Sun();
        }
        return instance;
    }

    private Sun() {
    }
}
