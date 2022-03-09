//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Advent.day5;

public class Point {
    private final int x;
    private final int y;
    private int crossings;

    public Point(int xc, int yc) {
        this.x = xc;
        this.y = yc;
        this.crossings = 0;
    }

    public int getCrossings() {
        return this.crossings;
    }

    public void addCrossing() {
        ++this.crossings;
    }

    public boolean compare(Point x) {
        return this.x == x.x && this.y == x.y;
    }
}
