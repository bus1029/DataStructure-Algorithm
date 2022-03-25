package algorithm.sort;

public class QuickSort implements Sort {
  private final int[] arr;

  public QuickSort(int[] arr) {
    this.arr = arr;
  }

  @Override
  public void sort() {
    quickSort(arr, 0, arr.length-1);
  }

  private void quickSort(int[] arr, int lIndex, int rIndex) {
    if (lIndex >= rIndex) {
      return;
    }

    int pivot = partition(arr, lIndex, rIndex);
    quickSort(arr, lIndex, pivot);
    quickSort(arr, pivot+1, rIndex);
  }

  private int partition(int[] arr, int lIndex, int rIndex) {
    // Mid partition
    int lPosition = lIndex-1;
    int rPosition = rIndex+1;
    int pivotValue = arr[(lIndex + rIndex) / 2];

    // Left partition
    /*int lPosition = lIndex;
    int rPosition = rIndex+1;
    int pivotValue = arr[lIndex];*/

    // Right partition
    /*int lPosition = lIndex-1;
    int rPosition = rIndex;
    int pivotValue = arr[rIndex];*/

    while (true) {
      do {
        lPosition++;
      } while (arr[lPosition] < pivotValue);

      do {
        rPosition--;
      } while (arr[rPosition] > pivotValue && lPosition <= rPosition);

      if (lPosition >= rPosition) {
        return rPosition;
      }

      swap(arr, lPosition, rPosition);
    }
  }

  private void swap(int[] arr, int l, int r) {
    int tmp = arr[l];
    arr[l] = arr[r];
    arr[r] = tmp;
  }
}
