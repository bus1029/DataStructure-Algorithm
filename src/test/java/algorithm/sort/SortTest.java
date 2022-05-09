package algorithm.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortTest {
  @Test
  void test_quickSort() {
    int[] arr = new int[]{1, 4, 2, 6, 13, 11, 5, 9, 7};
    new QuickSort(arr).sort();
    Assertions.assertArrayEquals(new int[]{1, 2, 4, 5, 6, 7, 9, 11, 13}, arr);
  }

  @Test
  void test_mergeSort() {
    int[] arr = new int[]{1, 4, 2, 6, 13, 11, 5, 9, 7};
    new MergeSort(arr).sort();
    Assertions.assertArrayEquals(new int[]{1, 2, 4, 5, 6, 7, 9, 11, 13}, arr);
  }
}
