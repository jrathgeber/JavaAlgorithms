/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms.Misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Jason
 */
public class Roman {


    public String intToRoman(int num) {

        Integer i = num;

        String ans = "";

        String[] m = {"", "M", "MM", "MMM"};
        String[] c = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] x = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] l = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        int mod10 = i % 10;
        int mod100 = i % 100;
        int mod1000 = i % 1000;

        int div1000 = i / 1000;

        ans += m[div1000];
        ans += c[mod1000/100];
        ans += x[mod100/10];
        ans += l[mod10];

        return ans;

    }



    public static void main(String[] args) throws IOException {

        Roman r = new Roman();

        String roman = r.intToRoman(1972);

        System.out.println(roman);

    }



}
