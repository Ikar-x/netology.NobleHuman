import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ComparePerson cp = new ComparePerson();
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Veniamin", "Nemirov Batareikin", 13));
        persons.add(new Person("Ivan", "Ryabov Petrov Tavricheskiy", 10));
        persons.add(new Person("Petr", "Ivanov", 15));
        persons.add(new Person("Ivan", "Kovrov Palasov", 12));
        persons.add(new Person("Egor", "Stahanov", 11));

        System.out.println(persons);
        System.out.println("++++++++++");

        Collections.sort(persons, cp);

        System.out.println(persons);
    }
}