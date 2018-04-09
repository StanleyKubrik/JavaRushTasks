package javaCore.level14.task335_lev14_lec08;

public class USD extends Money{
    public USD(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 10.0;
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
