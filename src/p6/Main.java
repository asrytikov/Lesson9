package p6;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Comparator personComparator = new PersonComparator().thenComparing(new PersonAgeComparator());
        TreeSet<Person> people = new TreeSet<>(personComparator);
        people.add(new Person("Ivan", 36));
        people.add(new Person("Ivan", 36));

        System.out.println(people.size());

        System.out.println(people);



    }

}

class PersonComparator implements Comparator<Person>{

    @Override
    public int compare(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }
}

class PersonAgeComparator implements Comparator<Person>{

    @Override
    public int compare(Person person, Person person2) {

        if (person.getAge()>person2.getAge())
            return 1;
        else if (person.getAge()<person2.getAge())
            return -1;
        else
            return 0;
    }
}