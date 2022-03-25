package algorithm.sort;

import org.junit.jupiter.api.Test;

class SortTest {
  @Test
  void test_quickSort() {
    int[] arr = new int[]{1, 4, 2, 6, 13, 11, 5, 9, 7};
    new QuickSort(arr).sort();
    for (int n : arr) {
      System.out.print(n + " ");
    }
  }
}
