package algorithm.search;

import org.junit.jupiter.api.Test;

class BFSTest {
  @Test
  void testGraphBFS_usingRecursion() {
    /*
        2 - 0 - 1
        |   | / |
    3 - 4   7   5
      \ |
        6
    */
    int[][] graph = {{1, 2, 7}, {0, 5, 7}, {0, 4}, {4, 6}, {2, 3, 6}, {1}, {3, 4}, {0, 1}};
    boolean[] visited = new boolean[graph.length];
    System.out.println(new BFS().search(0, graph, visited));
  }
}