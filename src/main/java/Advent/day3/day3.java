package Advent.day3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class day3 {
    public day3() {
    }

    public static String getGamma(ArrayList<String> data) {
        int ones = 0;
        int zeros = 0;
        String gamma = "";

        for(int i = 0; i < ((String)data.get(0)).length(); ++i) {
            ones = 0;
            zeros = 0;

            for(int j = 0; j < data.size(); ++j) {
                int bit = Integer.parseInt(((String)data.get(j)).substring(i, i + 1));
                if (bit == 1) {
                    ++ones;
                } else {
                    ++zeros;
                }
            }

            if (zeros > ones) {
                gamma = gamma + 0;
            } else {
                gamma = gamma + 1;
            }
        }

        return gamma;
    }

    public static void main(String[] args) throws IOException {
        File input = new File(".\\input\\M_advent3.txt");
        Scanner scan = new Scanner(input);
        ArrayList data = new ArrayList();

        while(scan.hasNextLine()) {
            String temp = scan.nextLine();
            data.add(temp);
        }

        scan.close();
        int ones = 0;
        int zeros = 0;
        String gamma = "";
        String epsilon = "";

        int i;
        int j;
        for(i = 0; i < ((String)data.get(0)).length(); ++i) {
            ones = 0;
            zeros = 0;

            for(j = 0; j < data.size(); ++j) {
                int bit = Integer.parseInt(((String)data.get(j)).substring(i, i + 1));
                if (bit == 1) {
                    ++ones;
                } else {
                    ++zeros;
                }
            }

            if (ones > zeros) {
                gamma = gamma + 1;
                epsilon = epsilon + 0;
            } else {
                gamma = gamma + 0;
                epsilon = epsilon + 1;
            }
        }

        i = Integer.parseInt(gamma, 2);
        j = Integer.parseInt(epsilon, 2);
        System.out.println("Part 1 Answer : " + i * j);
        System.out.println("Part 2 Start Size : " + data.size());
        ArrayList<String> data2 = new ArrayList(data);
        ArrayList<String> data3 = new ArrayList(data);
        int bitSize = ((String)data.get(0)).length();

        //int j;
        int gamma2;
        int gamma3;
        for(j = 0; j < bitSize; ++j) {
            System.out.println("Data3:");

            for(gamma2 = 0; gamma2 < data3.size(); ++gamma2) {
                System.out.println("Item x : " + (String)data3.get(gamma2));
            }

            gamma2 = Integer.parseInt(getGamma(data2).substring(j, j + 1));
            gamma3 = Integer.parseInt(getGamma(data3).substring(j, j + 1));
            System.out.println("Gamma3 is : " + gamma3);
            System.out.println("Size is : " + data3.size());
            System.out.println("J is : " + j);

            //int i;
            int bit;
            for(i = 0; i < data2.size(); ++i) {
                bit = Integer.parseInt(((String)data2.get(i)).substring(j, j + 1));
                if (bit != gamma2) {
                    data2.remove(i);
                    --i;
                }
            }

            for(i = 0; i < data3.size(); ++i) {
                bit = Integer.parseInt(((String)data3.get(i)).substring(j, j + 1));
                System.out.println("Bit is : " + bit);
                System.out.println("Gamma2 [" + gamma2 + "] bit [" + bit + "]");
                if (bit == gamma3 && data3.size() > 1) {
                    System.out.println("removing " + i);
                    data3.remove(i);
                    --i;
                }
            }
        }

        System.out.println("\nOxygen generator rating calc ");

        for(j = 0; j < data2.size(); ++j) {
            System.out.println("Item : " + (String)data2.get(j));
        }

        j = Integer.parseInt((String)data2.get(0), 2);
        System.out.println("Oxygen generator rating  " + j);
        System.out.println("\nCO2 scrubber rating Calc ");

        for(gamma2 = 0; gamma2 < data3.size(); ++gamma2) {
            System.out.println("Item : " + (String)data3.get(gamma2));
        }

        gamma2 = Integer.parseInt((String)data3.get(0), 2);
        System.out.println("CO2 scrubber rating  " + gamma2);
        System.out.println("\nLife Support ");
        gamma3 = j * gamma2;
        System.out.println("Life Support is " + gamma3);
    }
}