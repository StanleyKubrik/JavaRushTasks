package javaCore.level17.task409_lev17_lec04;

public class OurPresident {
    private static OurPresident president;

    static {
        synchronized (Object.class){
            president = new OurPresident();
        }
    }

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}
