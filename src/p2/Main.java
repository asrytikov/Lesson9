package p2;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> states = new LinkedList<>();
        states.add("Germany");
        states.add("France");
        states.add("Russia");
        states.add("China");

        states.add(1, "Italy");

        System.out.println(states.size());
        System.out.println(states.get(1));

        for(String state: states){
            System.out.println(state);
        }

        if (states.contains("Russia")){
            System.out.println("YES");
        }

        states.remove("China");
        states.removeFirst();
        states.removeLast();

        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Ivan", 33));
        people.addFirst(new Person("Nick", 34));
        people.addLast(new Person("Ivan", 35));

        for(Person person: people){
            System.out.println(person.getName());
        }

        if (people.contains(new Person("Ivan", 38))){
            System.out.println("YES");
        }
    }

}
