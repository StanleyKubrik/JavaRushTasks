package javaCore.level15.task361_lev15_lec12;

public class Moon implements Planet {
    private static Moon instance;

    public static Moon getInstance() {
        if (instance == null){
            instance = new Moon();
        }
        return instance;
    }

    private Moon() {
    }
}
