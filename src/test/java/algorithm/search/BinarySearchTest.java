package algorithm.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BinarySearchTest {
  private int[] arr;
  private int[] arrIncludeDup;

  @BeforeEach
  void initializeArray() {
    arr = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29};
    arrIncludeDup = new int[]{1, 2, 2, 3, 3, 3, 4, 6, 7};
  }

  @Test
  void testBinarySearch_success() {
    BinarySearch binarySearch = new BinarySearch(arr);
    int searched = binarySearch.search(9);
    assertThat(searched).isEqualTo(4);
  }

  @Test
  void testBinarySearch_fail() {
    BinarySearch binarySearch = new BinarySearch(arr);
    assertThatThrownBy(() -> binarySearch.search(8))
            .isInstanceOf(NoSuchElementException.class);
  }

  @Test
  void testBinarySearch_lowerBound() {
    BinarySearch binarySearch = new BinarySearch(arrIncludeDup);
    int searched = binarySearch.searchLowerBound(3);
    assertThat(searched).isEqualTo(3);

    int notFound = binarySearch.searchLowerBound(8);
    assertThat(notFound).isEqualTo(arrIncludeDup.length);
  }

  @Test
  void testBinarySearch_upperBound() {
    BinarySearch binarySearch = new BinarySearch(arrIncludeDup);
    int searched = binarySearch.searchUpperBound(3);
    assertThat(searched).isEqualTo(6);

    int notFound = binarySearch.searchUpperBound(8);
    assertThat(notFound).isEqualTo(arrIncludeDup.length);
  }
}