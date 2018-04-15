package javaCore.level17.task410_lev17_lec04;

public class IMF {
    private static IMF imf;

    public static IMF getFund() {
        synchronized (IMF.class){
            if (imf == null){
                imf = new IMF();
            }
        }
        return imf;
    }

    private IMF() {
    }
}
