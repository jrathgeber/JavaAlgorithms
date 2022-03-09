//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Advent.day4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class D4_Board {
    private D4_Tile[][] board = new D4_Tile[5][5];
    private ArrayList<Integer> occurences = new ArrayList(10);

    public D4_Board(ArrayList<String> info) {
        int r;
        for(r = 0; r < 5; ++r) {
            Scanner scan = new Scanner((String)info.get(r));

            for(int c = 0; c < 5; ++c) {
                this.board[r][c] = new D4_Tile(r, c, scan.nextInt());
            }
        }

        for(r = 0; r < 10; ++r) {
            this.occurences.add(0);
        }

    }

    public void call(int num) {
        for(int r = 0; r < 5; ++r) {
            for(int c = 0; c < 5; ++c) {
                if (num == this.board[r][c].getValue()) {
                    this.board[r][c].call();
                    if (r == 0) {
                        this.occurences.set(0, (Integer)this.occurences.get(0) + 1);
                    } else if (r == 1) {
                        this.occurences.set(1, (Integer)this.occurences.get(1) + 1);
                    } else if (r == 2) {
                        this.occurences.set(2, (Integer)this.occurences.get(2) + 1);
                    } else if (r == 3) {
                        this.occurences.set(3, (Integer)this.occurences.get(3) + 1);
                    } else if (r == 4) {
                        this.occurences.set(4, (Integer)this.occurences.get(4) + 1);
                    }

                    if (c == 0) {
                        this.occurences.set(5, (Integer)this.occurences.get(5) + 1);
                    } else if (c == 1) {
                        this.occurences.set(6, (Integer)this.occurences.get(6) + 1);
                    } else if (c == 2) {
                        this.occurences.set(7, (Integer)this.occurences.get(7) + 1);
                    } else if (c == 3) {
                        this.occurences.set(8, (Integer)this.occurences.get(8) + 1);
                    } else if (c == 4) {
                        this.occurences.set(9, (Integer)this.occurences.get(9) + 1);
                    }
                }
            }
        }

    }

    public D4_Board checkForWin() {
        Iterator var2 = this.occurences.iterator();

        while(var2.hasNext()) {
            Integer n = (Integer)var2.next();
            if (n == 5) {
                return this;
            }
        }

        return null;
    }

    public int score(int num) {
        int sum = 0;

        for(int r = 0; r < 5; ++r) {
            for(int c = 0; c < 5; ++c) {
                if (!this.board[r][c].getCalled()) {
                    sum += this.board[r][c].getValue();
                }
            }
        }

        return sum * num;
    }
}
