package javaCore.level14.task327_lev14_lec04_HenFactory;

public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 500;
    }

    String getDescription(){
        return (super.getDescription()
                + "Моя страна - Belarus. "
                + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
