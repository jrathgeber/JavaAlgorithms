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
public class Roman {
            
    public static void main(String[] args) throws IOException {
    
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    
    BufferedReader in = new BufferedReader(reader);

    String line;
        
        while ((line = in.readLine()) != null) {

          Integer i = Integer.parseInt(line);

          String ans = "X = "; 
          
          int mod1 =  i % 1;
          int mod5 =  i % 5;
          int mod10 = i % 10;
          int mod50 = i % 50;
          int mod100 = i % 100;
          int mod500 = i % 500;
          int mod1000 = i % 1000;
                              
          int div1 =  i / 1;
          int div5 =  i / 5;
          int div10 = i / 10;
          int div50 = i / 50;
          int div100 = i / 100;
          int div500 = i / 500;
          int div1000 = i / 1000;
          
          
          if (div1000 > 1 ) {
          
            for (int x=0;x<div1000;x++){  
                ans += "M";  
            }
              
          } else if (div500 > 1) {
                      
            for (int x=0;x<div500;x++){  
                ans += "D";  
            }         
                  
          } else if (div100 > 1) {
                      
            for (int x=0;x<div100;x++){  
                ans += "C";  
            }         
                  
          
          } else if (div50 > 1) {
                      
            for (int x=0;x<div50;x++){  
                ans += "L";  
            }         
         
          } else if (div10 > 1) {
                      
            for (int x=0;x<div10;x++){  
                ans += "X";  
            }         
                     
          } else if (div5 > 1) {
                      
            for (int x=0;x<div5;x++){  
                ans += "V";  
            }         
                  
          } else if (div1 < 4) {
                      
            for (int x=0;x<div1;x++){  
                ans += "I";  
            }    
            
          }                    
                   
          System.out.println(ans);
         
          }
    }  

}
