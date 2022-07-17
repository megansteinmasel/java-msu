// Baseball Program: Player Class
// Megan Steinmasel
// September 20th, 2021

package bpprogram;

import java.text.DecimalFormat;

public class Player { 
    private String name;
    
    public Player(String n){ 
        name = n;
    }
    
    
    public void hits(){
        
        System.out.println(name+" comes to bat and gets a hit.");
       
    }
    
    public void outs(){
        
        System.out.println(name+" comes to bat and gets out.");
           
    }
    
    public void walks(){
        
        System.out.println(name+" comes to bat and gets four balls for a free pass.");
        
    }
    
    public void error(){
        
        System.out.println(name+" comes to bat and gets hit by the pitch.");
       
    }
   
    public void onBase(int hits, int outs, int walks, int errors){
        
        double firstpart = (hits + walks + errors); 
        double secondpart = (hits + walks + outs + errors); 
        double onbaseave = firstpart / secondpart; 
        
        DecimalFormat df = new DecimalFormat("0.000");
        String formatted = df.format(onbaseave);
        
        
        System.out.println(name +" OB% would be "+ (hits + walks + errors) + " for " + (hits + walks + outs + errors) + " or "+ formatted);  
    }
    
    public void battingAve(int hits, int outs, int errors){
        double num = hits;
        double den = (hits + outs + errors);        
        double battingave = num / den;
        
        DecimalFormat df = new DecimalFormat("0.000");
        String formatted = df.format(battingave);
        
        System.out.println(name +" batting average would be "+ hits + " for " + (hits + outs + errors) + " or "+ formatted);
    }
}    
    
    
    
    
        
    
    


