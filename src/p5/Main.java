package p5;

import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<>();
        states.add("Germany");
        states.addFirst("France");
        states.addLast("Russia");
        states.push("Spain");
        states.add("China");

        String sFirst = states.getFirst();
        System.out.println(sFirst);

        while (states.peek()!=null){
            System.out.println(states.pop());
        }

        System.out.println(states.size());

    }

}
