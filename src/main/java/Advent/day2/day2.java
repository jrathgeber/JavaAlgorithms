package Advent.day2;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class day2
{
    public static void main(String[] args) throws IOException
    {
        File input = new File("M:\\\\Advent\\Advent\\input\\J_advent2.txt");
        Scanner scan = new Scanner(input);
        ArrayList<String> data = new ArrayList<>();

        while(scan.hasNextLine())
        {
            String temp = scan.nextLine();
            data.add(temp);
        }

        scan.close();

        int xPos = 0; //horizontal position
        int yPos = 0; //depth

        //-------------------------------------------- part 1 --------------------------------------------
        for(String s: data)
        {
            if(s.substring(0,2).equals("up")) yPos-=Integer.parseInt(s.substring(3,4));
            else if(s.substring(0,2).equals("do")) yPos+=Integer.parseInt(s.substring(5,6));
            else if(s.substring(0,2).equals("fo")) xPos+=Integer.parseInt(s.substring(8,9));
        }

        System.out.println("Part 1: "+xPos*yPos);

        //-------------------------------------------- part 2 --------------------------------------------
        xPos = 0;
        yPos = 0;
        int aim = 0;

        for(String s: data)
        {
            if(s.substring(0,2).equals("up")) aim-=Integer.parseInt(s.substring(3,4));
            else if(s.substring(0,2).equals("do")) aim+=Integer.parseInt(s.substring(5,6));
            else if(s.substring(0,2).equals("fo"))
            {
                xPos+=Integer.parseInt(s.substring(8,9));
                yPos+=aim*Integer.parseInt(s.substring(8,9));
            }
        }

        System.out.println("Part 2: "+xPos*yPos);
    }
}