package algorithm.sort;

import java.util.Arrays;

public class MergeSort implements Sort {
  private final int[] array;

  public MergeSort(int[] array) {
    this.array = array;
  }

  @Override
  public void sort() {
    mergeSort(array, array.length);
  }

  private void mergeSort(int[] arr, int n) {
    if (n < 2) {
      return;
    }

    int mid = n / 2;
    int[] l = Arrays.copyOfRange(arr, 0, mid);
    int[] r = Arrays.copyOfRange(arr, mid, n);

    mergeSort(l, mid);
    mergeSort(r, n-mid);
    merge(arr, l, r, mid, n-mid);
  }

  private void merge(int[] arr, int[] l, int[] r, int lLength, int rLength) {
    int lIndex = 0;
    int rIndex = 0;
    int resultIndex = 0;

    while (lIndex < lLength && rIndex < rLength) {
      if (l[lIndex] <= r[rIndex]) {
        arr[resultIndex++] = l[lIndex++];
      } else {
        arr[resultIndex++] = r[rIndex++];
      }
    }

    while (lIndex < lLength) {
      arr[resultIndex++] = l[lIndex++];
    }

    while (rIndex < rLength) {
      arr[resultIndex++] = r[rIndex++];
    }
  }
}
