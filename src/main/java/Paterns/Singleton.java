/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paterns;

/**
 *
 * @author jrathgeber
 */
public class Singleton {
    
    private static Singleton instance = null;
        
    private Singleton () {} ;
    
    public static Singleton getSingleton() {
                
        if (instance == null) {

            synchronized (Singleton.class){
       
                if (instance == null) {

                    instance = new Singleton();
                    System.out.println("Creating new instance");
                }
            }
       } 
            
            
        return instance;
     
    }    
        
     public void printSingleton(){

        System.out.println("Inside print Singleton");
    }
        
     
    public static void main (String... aArguments) {
        
        Singleton sg = Singleton.getSingleton() ;
        
        //sg.printSingleton();
        
        Singleton sx = Singleton.getSingleton()  ;
        
        Singleton sz = new Singleton ();
        
        sz.printSingleton();
    }
                       
}
