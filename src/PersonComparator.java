import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    private int countWords;

    public PersonComparator(int countWords) {
        this.countWords = countWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int count = o1.getSurname().split("\\P{IsAlphabetic}+").length +
                o2.getSurname().split("\\P{IsAlphabetic}+").length;
        if (count > countWords) {
            if (o1.getAge() < o2.getAge()) {
                return -1;
            } else if (o1.getAge() > o2.getAge()) {
                return 1;
            } else {
                return -1;
            }
        } else if (o1.getSurname().length() < o2.getSurname().length()) {
            return -1;
        } else if (o1.getSurname().length() > o2.getSurname().length()) {
            return 1;
        } else {
            if (o1.getAge() < o2.getAge()) {
                return -1;
            } else if (o1.getAge() > o2.getAge()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
