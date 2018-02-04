import vo.Person;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public static List<Person> getListOfPerson(){
        List<Person> list = new ArrayList<>();

        list.add(new Person("Sam", "Sam@asd.com"));
        list.add(new Person("Adi", "adi@asd.com"));
        list.add(new Person("brandn", "brandn@asd.com"));
        list.add(new Person("Sai", "Sai@asd.com"));
        list.add(new Person("Andi", "Andi@asd.com"));
        list.add(new Person("Kanwar", "kanwar@asd.com"));
        list.add(new Person("zahid", "zahid@asd.com"));
        list.add(new Person("cris", "cris@asd.com"));

        return list;
    }

    public static void printLine(){
        System.out.println("****************************************************");
    }
}
