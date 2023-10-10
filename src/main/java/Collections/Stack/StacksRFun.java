package Collections.Stack;

import java.util.Stack;

public class StacksRFun

{


    public static void main(String...args){

                Stack<String> games = new Stack<String>();

                games.add("Call of duty");
                games.add("Guitar Hero");
                games.add("Super Monkey Ball");

                System.out.println(games.peek());
                System.out.println(games);

                System.out.println(games.pop());
                System.out.println(games);

                System.out.println(games.contains("Zelda"));

    }

}
