import javafx.util.Pair;

import java.util.List;

public interface BFS {

    /**
     * prints out the BFS path
     * @param g
     * @param start
     * @return
     */
    List<Pair<Integer,Integer>> bfs(Graph g, int start);

}
