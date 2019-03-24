import org.junit.Before;
import org.junit.Test;

public class TestBfsGraph {

    private Graph g ;
    private int startNode;

    @Before
    public void setup(){
        g = new BfsGraph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        startNode = 0;
    }

    @Test
    public void testBfsTraversal(){

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");
        BfsGraph bfs = (BfsGraph) g;
        System.out.println(bfs.bfs(g,startNode));

    }
}
