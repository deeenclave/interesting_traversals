import java.util.LinkedList;

public class Graph {

    // total number of vertices
    private int n;
    // q of adjacent vertices
    private LinkedList<Integer> adj[];

    public LinkedList<Integer>[] getAdj() {
        return adj;
    }

    public Graph(int n){
        this.n = n;
        adj = new LinkedList[n];
    }

    // Add an edge to the graph
    public boolean addEdge(int src,int dest){
        return adj[src].add(dest);
    }

}
