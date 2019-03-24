import java.util.LinkedList;

/**
 * BFS works by visiting each adjacent vertex for a given vertex in Queue order
 * i.e. FIFO
 * it also maintains a list of visited vertex so that there is no loop
 * Must store each node in memory which is a disadvantage for large graphs
 */
public class BfsGraph extends Graph implements BFS {

    BfsGraph(int total) {
        super(total);
        visited = new boolean[total]; // by default mark all visited nodes as false
        queued = new LinkedList<>();
    }

    // Do not revisit the node if it is has already been visited
    private boolean visited[];

    // Queue which maintains the order
    private LinkedList<Integer> queued;

    public String bfs(Graph g, int start) {

        // enqueue the start node
        queued.add(start);

        int currNode = start;

        // Traverse the queue as long as it has elements
        while (!queued.isEmpty()) {
            // pop the first node
            currNode = queued.removeFirst();
            // mark it as visited
            visited[currNode] = true;
            // check each adjacent node for the current node
            while (!super.getAdj()[currNode].isEmpty()) {
                int adjNode = super.getAdj()[currNode].removeFirst();
                // check if the adjNode is already visited
                if (!visited[adjNode]) {
                    queued.addLast(adjNode); // enqueue it
                    visited[adjNode] = true; // mark it as visited
                }
            }

        }
        return null;
    }
}
