package algorithm.search;

import java.util.NoSuchElementException;

public class BinarySearch {
  private final int[] arr;

  public BinarySearch(int[] arr) {
    this.arr = arr;
  }

  // 정확히 일치하는 값이 있을 때 해당 값의 인덱스 반환
  public int search(int key) {
    int mid;
    int low = 0;
    int high = arr.length-1;
    while (low <= high) {
      mid = (low + high) / 2;
      if (arr[mid] == key) {
        return mid;
      } else if (key < arr[mid]) {
        high = mid-1;
      } else {
        low = mid+1;
      }
    }
    throw new NoSuchElementException("Cannot find element: " + key);
  }

  // 특정 값보다 같거나 큰 값이 처음 나오는 인덱스 반환
  public int searchLowerBound(int key) {
    int mid;
    int low = 0;
    int high = arr.length;
    while (low < high) {
      mid = (low + high) / 2;
      if (key <= arr[mid]) {
        // high 가 정답일 수도 있으니까 검색에 포함시킴
        high = mid;
      } else {
        // key > arr[mid]
        // mid 보다 key 값이 크기 때문에 mid 를 검색 조건에서 제외
        low = mid + 1;
      }
    }
    return low;
  }

  // 특정 값보다 큰 값이 처음 나오는 인덱스 반환
  public int searchUpperBound(int key) {
    int mid;
    int low = 0;
    int high = arr.length;
    while (low < high) {
      mid = (low + high) / 2;
      if (key >= arr[mid]) {
        // 최초로 큰 값이 나오는 인덱스를 찾는 것이기 때문에 검색 조건이 같거나 클 경우 mid 를 검색조건에 포함시키지 않음
        low = mid + 1;
      } else {
        // key < arr[mid]
        // mid 가 정답일 수도 있으니까 검색 조건에 포함시킴
        high = mid;
      }
    }
    return low;
  }
}
