package javaCore.level14.task327_lev14_lec04_HenFactory;

public class MoldovanHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 400;
    }

    String getDescription(){
        return (super.getDescription()
                + "Моя страна - Moldova. "
                + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
