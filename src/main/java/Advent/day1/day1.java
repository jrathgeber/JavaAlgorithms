package Advent.day1;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class day1
{
    public static void main(String[] args) throws IOException
    {
        File input = new File("M:\\\\Advent\\Advent\\input\\M_advent1.txt");
        Scanner scan = new Scanner(input);
        ArrayList<Integer> data = new ArrayList<Integer>();

        while(scan.hasNextLine())
        {
            String temp = scan.nextLine();
            data.add(Integer.parseInt(temp));
        }

        scan.close();

        //-------------------------------------------- part 1 --------------------------------------------
        int count = 0;
        for(int i=1; i<data.size(); i++)
        {
            if(data.get(i-1) < data.get(i)) count++;
        }

        System.out.println("Part 1: "+count);

        //-------------------------------------------- part 2 --------------------------------------------
        count = 0;

        for(int i=3; i<data.size(); i++)
        {
            int sum1 = data.get(i-3) + data.get(i-2) + data.get(i-1);
            int sum2 = data.get(i-2) + data.get(i-1) + data.get(i);
            if(sum1 < sum2) count++;
        }

        System.out.println("Part 2: "+count);
    }
}
