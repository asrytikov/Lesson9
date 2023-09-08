package p4;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<String> states = new TreeSet<>();
        states.add("Germany");
        states.add("France");
        states.add("Russia");
        states.add("China");

        for(String state: states){
            System.out.println(state);
        }

        System.out.println(states.first());
        System.out.println(states.last());
        SortedSet<String> set = states.subSet("China", "Germany");
        System.out.println(set);

        NavigableSet<String> navigableSet = states.descendingSet();
        System.out.println(navigableSet);



    }

}
