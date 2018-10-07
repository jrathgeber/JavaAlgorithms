/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Didgital;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Jason
 */
public class Test {
    
    
    public static void main(String[] args) throws IOException {
    
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);

    BufferedReader in = new BufferedReader(reader);

    String line;

        
        while ((line = in.readLine()) != null) {

          System.out.println(line);

          Integer i = Integer.parseInt(line);

          Integer ans = i * i;

          System.out.println(ans);

        }
      
    }  
    
    
}
