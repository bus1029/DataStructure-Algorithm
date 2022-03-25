package algorithm.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DFSTest {
  @Test
  void testGraphDFS_usingRecursion() {
        /*
        2 - 0 - 1
        |   | / |
    3 - 4   7   5
      \ |
        6
     */
    int[][] graph = {{1, 2, 7}, {0, 5, 7}, {0, 4}, {4, 6}, {2, 3, 6}, {1}, {3, 4}, {0, 1}};
    boolean[] visited = new boolean[graph.length];
    new DFS().dfs(0, graph, visited);
  }
}