package algorithm.search;

public class DFS {
  public void search(int index, int[][] graph, boolean[] visited) {
    visited[index] = true;
    System.out.print(index + "->");
    for (int node : graph[index]) {
      if (!visited[node]) {
        search(node, graph, visited);
      }
    }
  }
}
