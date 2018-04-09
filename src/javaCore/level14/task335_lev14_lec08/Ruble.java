package javaCore.level14.task335_lev14_lec08;

public class Ruble extends Money{
    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 40.0;
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
