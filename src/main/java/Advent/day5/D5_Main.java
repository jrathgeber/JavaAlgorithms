// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Advent.day5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class D5_Main {
    public D5_Main() {
    }

    public static void main(String[] args) throws IOException {
        File file = new File(".\\input\\M_advent5.txt");
        Scanner scan = new Scanner(file);
        ArrayList<Line> lines = new ArrayList();
        ArrayList points = new ArrayList();

        while(true) {

            int y;
            int y1 = 0;
            int x1 = 0 ;
            int x2 = 0;
            int y2 = 0;

            do {

                int j;
            //    int x2;
            //    int y2;

                if (!scan.hasNextLine()) {
                    scan.close();
                    Iterator var17 = lines.iterator();

                    while(var17.hasNext()) {

                        Line l = (Line)var17.next();
                        //int x1 = l.getX1();
                        //int y1 = l.getY2();

                        x2 = l.getX2();
                        y2 = l.getY2();
                        if (l.getX1() > l.getX2()) {
                            x1 = l.getX2();
                            x2 = l.getX1();
                        }

                        if (l.getY1() > l.getY2()) {
                            y1 = l.getY2();
                            y2 = l.getY1();
                        }

                        for(y = x1; y < x2; ++y) {
                            points.add(new Point(y, y1));
                        }

                        for(y = y1; y < y2; ++y) {
                            points.add(new Point(x1, y));
                        }
                    }

                    int i;
                    for(i = 0; i < points.size() - 1; ++i) {
                        for(j = i + 1; j < points.size(); ++j) {
                            if (((Point)points.get(i)).compare((Point)points.get(j))) {
                                ((Point)points.get(i)).addCrossing();
                            }
                        }
                    }

                    i = 0;
                    Iterator var21 = points.iterator();

                    while(var21.hasNext()) {
                        Point p = (Point)var21.next();
                        if (p.getCrossings() > 1) {
                            ++i;
                        }
                    }

                    System.out.println("Number of Points Where 2+ Lines Overlap: " + i);
                    return;
                }

                String temp = scan.nextLine();
                j = temp.indexOf("->");
                String coord1 = temp.substring(0, j - 1);
                String coord2 = temp.substring(j + 3, temp.length());
                x2 = coord1.indexOf(",");
                y2 = coord2.indexOf(",");
                y = Integer.parseInt(coord1.substring(0, x2));
                y1 = Integer.parseInt(coord1.substring(x2 + 1, coord1.length()));
                x2 = Integer.parseInt(coord2.substring(0, y2));
                y2 = Integer.parseInt(coord2.substring(y2 + 1, coord2.length()));
            } while(y != x2 && y1 != y2);

            lines.add(new Line(y, y1, x2, y2));
        }
    }
}
