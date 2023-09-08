package p3;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> states = new HashSet<>();
        states.add("Germany");
        states.add("France");
        states.add("Russia");
        states.add("China");

        boolean isAdded = states.add("China");
        System.out.println(isAdded);

        for (String state: states){
            System.out.println(state);
        }

        HashSet<Person> people = new HashSet<>();
        people.add(new Person("Ivan", 33));
        people.add(new Person("Nick", 34));
        people.add(new Person("Ivan", 38));

        System.out.println(people.size());

    }

}
