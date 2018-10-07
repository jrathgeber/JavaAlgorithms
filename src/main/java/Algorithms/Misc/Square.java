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
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Jason
 */
public class Square {
        
    public static void main(String[] args) throws IOException {
    
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);

    BufferedReader in = new BufferedReader(reader);

    String line;
    
    // Structureto hold sides
    int[][] numbers = new int[2][4];
        
    int side = 0;
    
    // Read Data
    while ((line = in.readLine()) != null) {
        
        // Get Strings
        List<String> stringList = Arrays.asList((line.split(",")));
       
        // Parse strings to in struct
        for(int i = 0;i < stringList.size();i++)
        {
                numbers[i][side] = Integer.parseInt(stringList.get(i));

        }
            
        side++;      
        
        // Stop at 4 sides for square
        if (side > 3) {
        
            break;
        }
             
        
        

      }
      
    
    int l1 = 0;
    int l2 = 0;
    int l3 = 0;
    int l4 = 0;
    
     // test length of each side to be equal
     for (int x = 0; x<4; x++ ) {
        
        l1 =   numbers[0][0] - numbers[1][3];
        l2 =   numbers[0][1] - numbers[1][2];
        l3 =   numbers[0][2] - numbers[1][1];
        l4 =   numbers[0][3] - numbers[1][0];
                        
    }
    
    Boolean ans = false;
     
    if (l1 == l2 && l1 == l3 && l1 == l4 ) {
        
         ans = true;
        
    }
     
      
           
      System.out.println(ans);
     

    }  
    
    
}
