package algorithm.search;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
  public String search(int start, int[][] graph, boolean[] visited) {
    StringBuilder sb = new StringBuilder();
    Queue<Integer> q = new LinkedList<>();

    q.offer(start);
    visited[start] = true;

    while (!q.isEmpty()) {
      Integer node = q.poll();
      sb.append(node).append("->");

      for (int i = 0; i < graph[node].length; i++) {
        int tmp = graph[node][i];
        if (!visited[tmp]) {
          visited[tmp] = true;
          q.offer(tmp);
        }
      }
    }

    return sb.toString();
  }
}
