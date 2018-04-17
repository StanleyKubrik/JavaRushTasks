package javaCore.level17.task425_lev17_lec10_restaurant;

public class Table {
    private static byte tableNumber;
    private byte number = ++tableNumber;

    public Order getOrder () {
        return new Order(number);
    }
}
