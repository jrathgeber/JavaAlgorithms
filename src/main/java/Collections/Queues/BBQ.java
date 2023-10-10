package Collections.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class BBQ {




    public static void main(String[] args) {

        Queue<String> bbqLine = new LinkedList<String>();

        bbqLine.add("Jackson");
        bbqLine.add("Tyreek");
        bbqLine.add("Susan");

        bbqLine.poll();
        //bbqLine.poll();

        System.out.println(bbqLine);

    }


}
