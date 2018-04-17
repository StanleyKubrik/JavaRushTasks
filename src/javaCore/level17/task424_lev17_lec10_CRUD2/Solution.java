package javaCore.level17.task424_lev17_lec10_CRUD2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        String name;
        Sex sex;
        Date bd;
        Person p;
        int id;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        for (int i = 0; i < args.length - 1; i++) {
            if (args[i].equals("-c")){
                name = args[i + 1];
                sex = (args[i + 2].equals("м")) ? Sex.MALE : Sex.FEMALE;
                bd = df.parse(args[i + 3]);
                if (sex == Sex.MALE){
                    p = Person.createMale(name, bd);
                } else {
                    p = Person.createFemale(name, bd);
                }
                allPeople.add(p);
                System.out.println(allPeople.indexOf(p));
            }

            if (args[i].equals("-u")){
                id = Integer.parseInt(args[i + 1]);
                name = args[i + 2];
                sex = (args[i + 3].equals("м")) ? Sex.MALE : Sex.FEMALE;
                bd = df.parse(args[i + 4]);
                p = allPeople.get(id);
                p.setName(name);
                p.setSex(sex);
                p.setBirthDay(bd);
            }

            if (args[i].equals("-d")){
                id = Integer.parseInt(args[i + 1]);
                p = allPeople.get(id);
                p.setName(null);
                p.setSex(null);
                p.setBirthDay(null);
            }

            if (args[i].equals("-i")){
                id = Integer.parseInt(args[i + 1]);
                p = allPeople.get(id);
                String sx = (p.getSex() == Sex.MALE) ? "м" : "ж";
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                System.out.println(p.getName() + " " + sx + " " + sdf.format(p.getBirthDay()));
            }
        }
    }
}
