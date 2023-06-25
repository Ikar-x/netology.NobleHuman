import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Comparator<Person> cp = (o1, o2) -> {
            String[] mas1 = o1.getSurname().split("\\P{IsAlphabetic}+");
            String[] mas2 = o2.getSurname().split("\\P{IsAlphabetic}+");
            if (mas1.length == mas2.length) return o1.getAge() - o2.getAge();
            return mas1.length - mas2.length;
        };

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