package javaCore.level14.task339_lev14_lec08;

public class Singleton {
    private static final Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

    private Singleton(){
    }
}
