package javaCore.level14.task335_lev14_lec08;

public class Hrivna extends Money{
    public Hrivna(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 25.0;
    }

    @Override
    public String getCurrencyName() {
        return "HRN";
    }
}
