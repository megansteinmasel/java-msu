
package graph;

import java.util.LinkedList;


public class GraphMethods {
    private LinkedList<Integer>[] adjacencyList;
    private int numEdges;
    
    
    public GraphMethods(int numVertices) {
        adjacencyList = new LinkedList[numVertices];
        
        for (int i = 0; i < adjacencyList.length; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }
    
    // returns number of vertices
    public int getNumVertices() {
        return adjacencyList.length;
    }
    
    // returns number of edges
    public int getNumEdges() {
        return numEdges;
    }
    
    // manually add egdes in main with this method
    public void addEdge(int vertex1, int vertex2) {
        adjacencyList[vertex1].add(vertex2);
        adjacencyList[vertex2].add(vertex1);
        
        numEdges++;
    }
    
    // returns neighbors
    public LinkedList<Integer> getNeighbors(int vertex) {
        return adjacencyList[vertex];
    }
    
    // marks the node as visited and prints it
    public void visited(int v, boolean[] visitedVertex){
        visitedVertex[v] = true;
        System.out.print(v + " ");
        
        for (int i : getNeighbors(v)) {
            if (!visitedVertex[i])
                visited(i, visitedVertex);
        }
    }
    
    // prints connected components 
    public void printConnectedComponents() {
        boolean[] visitedVertex = new boolean[adjacencyList.length];
        for (int i = 0; i < adjacencyList.length; ++i) {
            if (!visitedVertex[i]) {
                visited(i, visitedVertex);
                System.out.println(" ");
            }
        }
    }
    
    
    
}
