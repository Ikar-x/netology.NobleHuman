import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<Person> isYoung = p -> {
            return p.getAge() < 18;
        };

        ComparePerson cp = new ComparePerson();
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Veniamin", "Nemirov Batareikin", 13));
        persons.add(new Person("Ivan", "Ryabov Petrov Tavricheskiy", 20));
        persons.add(new Person("Petr", "Ivanov", 25));
        persons.add(new Person("Ivan", "Kovrov Palasov", 22));
        persons.add(new Person("Egor", "Stahanov", 11));

        System.out.println(persons);
        System.out.println("++++++++++");

        Collections.sort(persons, cp);

        System.out.println(persons);
        System.out.println("++++++++++");

        persons.removeIf(isYoung);
        System.out.println(persons);
    }
}