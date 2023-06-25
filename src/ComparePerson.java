import java.util.Arrays;
import java.util.Comparator;

public class ComparePerson implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        String[] mas1 = o1.getSurname().split("\\P{IsAlphabetic}+");
        String[] mas2 = o2.getSurname().split("\\P{IsAlphabetic}+");
        if(mas1.length == mas2.length) return o1.getAge() - o2.getAge();
        return mas1.length - mas2.length;
    }
}
