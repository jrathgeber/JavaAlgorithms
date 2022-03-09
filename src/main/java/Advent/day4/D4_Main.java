//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Advent.day4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class D4_Main {
    public D4_Main() {
    }

    public static void main(String[] args) throws IOException {
        File file = new File(".\\input\\J_advent4.txt");
        Scanner scan = new Scanner(file);
        ArrayList<Integer> numberList = new ArrayList();
        String numbers = scan.nextLine() + ",";
        Scanner scan2 = new Scanner(numbers);
        scan2.useDelimiter(",");

        while(scan2.hasNextInt()) {
            numberList.add(scan2.nextInt());
        }

        scan2.close();
        ArrayList boards = new ArrayList();

        ArrayList boardsCopy;
        int num;
        while(scan.hasNextLine()) {
            scan.nextLine();
            boardsCopy = new ArrayList();

            for(num = 0; num < 5; ++num) {
                boardsCopy.add(scan.nextLine());
            }

            boards.add(new D4_Board(boardsCopy));
        }

        scan.close();
        boardsCopy = new ArrayList(boards);
        Iterator var9 = numberList.iterator();

        while(var9.hasNext()) {
            num = (Integer)var9.next();

            for(int i = 0; i < boardsCopy.size(); ++i) {
                ((D4_Board)boardsCopy.get(i)).call(num);
                D4_Board x = ((D4_Board)boardsCopy.get(i)).checkForWin();
                if (x != null) {
                    if (boardsCopy.size() == 100) {
                        System.out.println("Score of First Winning Board: " + ((D4_Board)boardsCopy.get(i)).score(num));
                    }

                    if (boardsCopy.size() == 1) {
                        System.out.println("Score of Last Winning Board: " + ((D4_Board)boardsCopy.get(i)).score(num));
                        return;
                    }

                    boardsCopy.remove(boardsCopy.get(i));
                    --i;
                }
            }
        }

    }
}
