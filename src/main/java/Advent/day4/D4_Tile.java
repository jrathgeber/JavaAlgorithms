//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Advent.day4;

public class D4_Tile {
    private int row;
    private int col;
    private int value;
    private boolean called;

    public D4_Tile(int r, int c, int val) {
        this.row = r;
        this.col = c;
        this.value = val;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public int getValue() {
        return this.value;
    }

    public boolean getCalled() {
        return this.called;
    }

    public void call() {
        this.called = true;
    }
}
