package javaCore.level14.task327_lev14_lec04_HenFactory;

public class UkrainianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 700;
    }

    String getDescription(){
        return (super.getDescription()
                + "Моя страна - Ukraine. "
                + "Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
