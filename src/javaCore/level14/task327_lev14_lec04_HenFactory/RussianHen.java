package javaCore.level14.task327_lev14_lec04_HenFactory;

public class RussianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 600;
    }

    String getDescription(){
        return (super.getDescription()
                + "Моя страна - Russia. "
                + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
