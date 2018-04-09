package javaCore.level14.task335_lev14_lec08;

public abstract class Money {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }

    public abstract String getCurrencyName();
}
