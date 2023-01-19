import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Person> arrayList = new ArrayList<>();
        Person person01 = new Person("Tanya", "Ivanova", 20);
        Person person02 = new Person("Petya", "Ivanova", 25);
        Person person03 = new Person("Sonya", "Vasilyev-Slon", 30);
        Person person04 = new Person("Sonya", "Vasilyeva", 22);
        Person person05 = new Person("Sonya", "Vasily Gol", 19);
        Person person06 = new Person("Sonya", "Vasilisovna", 22);
        arrayList.add(person01);
        arrayList.add(person02);
        arrayList.add(person03);
        arrayList.add(person04);
        arrayList.add(person05);
        arrayList.add(person06);
        Collections.sort(arrayList, new PersonComparator(2));
        System.out.println(arrayList);
        
        TreeSet<Person> set = new TreeSet<>(new PersonComparator(2));
        set.add(person01);
        set.add(person02);
        set.add(person03);
        set.add(person04);
        set.add(person05);
        set.add(person06);
        System.out.println(set);
    }

}
