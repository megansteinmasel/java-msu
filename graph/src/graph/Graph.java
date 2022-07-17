
// Creates a graph and prints connected components of that graph

package graph;

public class Graph {

    
    public static void main(String[] args) {
        
       // Test 1
       GraphMethods graph = new GraphMethods(9);
       
       graph.addEdge(0,1);
       graph.addEdge(1,3);
       graph.addEdge(3,0);
       graph.addEdge(0,2);
       graph.addEdge(2,4);
       graph.addEdge(4,3);
       
       graph.addEdge(5,6);
       graph.addEdge(6,8);
       
       System.out.println("Test 1: ");
       graph.printConnectedComponents();
       System.out.println(" ");
       
       // Test 2
       GraphMethods graph2 = new GraphMethods(5);
       
       graph2.addEdge(0,1);
       graph2.addEdge(1,2);
       graph2.addEdge(2,0);
       
       graph2.addEdge(3,4);
       
       System.out.println("Test 2: ");
       graph2.printConnectedComponents();
       System.out.println(" ");
       
       // Test 3
       GraphMethods graph3 = new GraphMethods(10);
       
       graph3.addEdge(0, 1);
       graph3.addEdge(1, 2);
       graph3.addEdge(2, 3);
       graph3.addEdge(3, 4);
       graph3.addEdge(4, 5);
       graph3.addEdge(5, 6);
       graph3.addEdge(6, 0);
       
       graph3.addEdge(3, 5);
       graph3.addEdge(0, 4);
       graph3.addEdge(5, 7);
       
       
       System.out.println("Test 3: ");
       graph3.printConnectedComponents();
       System.out.println(" ");
       
       
       
    }
    
    
}
