package javaCore.level19;

import java.util.*;

public class task458_lev19_lec03 {
    public static Map<String,String> countries = new HashMap<>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            return customer.getCountryName();
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String[] strings = contact.getName().split(",\\s");
            return strings[1];
        }

        @Override
        public String getContactLastName() {
            String[] strings = contact.getName().split(",\\s");
            return strings[0];
        }

        @Override
        public String getDialString() {
            return "callto://" + contact.getPhoneNumber().substring(0,3) + contact.getPhoneNumber().substring(4,7)
                    + contact.getPhoneNumber().substring(8,11) + contact.getPhoneNumber().substring(12,14)
                    + contact.getPhoneNumber().substring(15);
        }
    }

    public interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}
