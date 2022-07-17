// Baseball Program: Main Class
// Megan Steinmasel
// September 20th, 2021

package bpprogram;

public class BPProgram {

    
    public static void main(String[] args) {
        
        //first player:
        Player first = new Player("Chipper Jones"); 
        
        int hit = 1; 
        int out = 2;
        int walk = 1; 
        int error = 1;
        
        first.hits(); 
        first.outs();
        first.outs();
        first.walks();
        first.error();
        System.out.println(" ");
        first.battingAve(hit, out, error);
        first.onBase(hit, out, walk, error);
        
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println(" ");
        
        //second player:
        
        Player second = new Player("Babe Ruth");
        
        int hits = 2;
        int outs = 1;
        int walks = 2;
        int errors = 0;
        
        second.hits();
        second.hits();
        second.outs();
        second.walks();
        second.walks();
        System.out.println(" ");
        second.battingAve(hits, outs, errors);
        second.onBase(hits, outs, walks, errors);
        
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println(" ");
        
        //third player:
        
        Player third = new Player("Willie Mays");
        
        int h = 2;
        int o = 0;
        int w = 3;
        int e = 0;
        
        third.hits();
        third.hits();
        third.walks();
        third.walks();
        third.walks();
        System.out.println(" ");
        third.battingAve(h, o, e);
        third.onBase(h, o, w, e);
        
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println(" ");
        
        
    }
    
    
    
}
