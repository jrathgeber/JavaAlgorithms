//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Advent.day5;

public class Line {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Line(int x1c, int y1c, int x2c, int y2c) {
        this.x1 = x1c;
        this.y1 = y2c;
        this.x2 = x2c;
        this.y2 = y2c;
    }

    public int getX1() {
        return this.x1;
    }

    public int getX2() {
        return this.x2;
    }

    public int getY1() {
        return this.y1;
    }

    public int getY2() {
        return this.y2;
    }

    public String toString() {
        return "(" + this.x1 + "," + this.y1 + ") -> (" + this.x2 + "," + this.y2 + ")";
    }
}
