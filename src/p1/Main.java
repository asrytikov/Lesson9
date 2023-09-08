package p1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> people = new ArrayList<>(25);
        people.ensureCapacity(100);
        people.add("Ivan");
        people.add("Nick");
        people.add("Roman");

        people.add(1, "Timofej");

        System.out.println(people.get(1));

        for (String person:people) {
            System.out.println(person);
        }

        people.set(1, "Anton");

        System.out.printf("ArrayList has %d elements \n", people.size());

        people.remove(0);
        people.remove("Anton");

        System.out.println("--------------------------");

        for (String person:people
             ) {
            System.out.println(person);
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
        Object[] peopleArray = people.toArray();
        for (Object person: peopleArray){
            System.out.println(person);
        }

        if (people.contains("Roman")){
            System.out.println("YES");
        }




    }

}
