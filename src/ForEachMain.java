import vo.Person;

import java.util.ArrayList;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {

        List<Person> listOfPerson = Util.getListOfPerson();

        //basic use
        //Printing the names only
        Util.printLine();
        System.out.println("List of names");
        listOfPerson.forEach(person ->
            System.out.println(person.getName())
        );

        //how to use multiple statements
        Util.printLine();
        System.out.println("List of name and Emails\n----");
        listOfPerson.forEach(person ->{
                System.out.println("Name:  "+  person.getName());
                System.out.println("Email:  "+person.getEmail());
            System.out.println("----");
        });
    }
}
