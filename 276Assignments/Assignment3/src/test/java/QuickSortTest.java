import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Provides unit tests for the {@link QuickSort} implementation of the {@link Sorter} interface.
 * This class ensures the correct operation of the QuickSort algorithm across different types of input arrays,
 * including special cases such as empty arrays, arrays with a single element, arrays that are already sorted,
 * arrays with reverse order, arrays with duplicate elements, and arrays containing negative numbers.
 * @author Tom
 */
public class QuickSortTest {

    /**
     * Factory method to create a new instance of {@link QuickSort}.
     * This method is used to instantiate a new {@link QuickSort} object for testing.
     *
     * @param <T> The type parameter for the objects to be sorted, which must extend {@link Comparable}.
     * @return A new instance of {@link QuickSort}.
     */
    private <T extends Comparable<T>> Sorter<T> createSorter() {
        return new QuickSort<>();
    }

    /**
     * Tests sorting an empty array. Verifies that no modifications are made to the array and no exceptions are thrown.
     */
    @Test
    public void testEmptyArray() {
        Integer[] array = {};
        Sorter<Integer> sorter = createSorter();
        sorter.sort(array);
        assertArrayEquals(new Integer[]{}, array);
    }

    /**
     * Tests sorting an array containing a single element. Ensures that an array with one element is considered sorted.
     */
    @Test
    public void testSingleElement() {
        Integer[] array = {1};
        Sorter<Integer> sorter = createSorter();
        sorter.sort(array);
        assertArrayEquals(new Integer[]{1}, array);
    }

    /**
     * Tests sorting an array that is already in ascending order. Checks that the sorting algorithm maintains the order.
     */
    @Test
    public void testSortedArray() {
        Integer[] array = {1, 2, 3, 4, 5};
        Sorter<Integer> sorter = createSorter();
        sorter.sort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    /**
     * Tests sorting an array in reverse order. Verifies that the algorithm correctly sorts it into ascending order.
     */
    @Test
    public void testReverseSortedArray() {
        Integer[] array = {5, 4, 3, 2, 1};
        Sorter<Integer> sorter = createSorter();
        sorter.sort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    /**
     * Tests sorting an array where all elements are equal. Confirms that the algorithm does not alter the array.
     */
    @Test
    public void testAllEqualElements() {
        Integer[] array = {1, 1, 1, 1, 1};
        Sorter<Integer> sorter = createSorter();
        sorter.sort(array);
        assertArrayEquals(new Integer[]{1, 1, 1, 1, 1}, array);
    }

    /**
     * Tests sorting an array containing duplicates. Ensures that duplicates are correctly handled and sorted.
     */
    @Test
    public void testDuplicatesInArray() {
        Integer[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        Sorter<Integer> sorter = createSorter();
        sorter.sort(array);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9}, array);
    }

    /**
     * Tests sorting an array containing negative numbers. Verifies that the algorithm sorts negative values correctly.
     */
    @Test
    public void testNegativeNumbers() {
        Integer[] array = {-3, -1, -4, -1, -5, -9, -2, -6, -5, -3, -5};
        Sorter<Integer> sorter = createSorter();
        sorter.sort(array);
        assertArrayEquals(new Integer[]{-9, -6, -5, -5, -5, -4, -3, -3, -2, -1, -1}, array);
    }

    /**
     * Tests sorting an array with a mix of positive, negative, and zero values. Checks correct sorting across the range.
     */
    @Test
    public void testMixedNumbers() {
        Integer[] array = {3, -1, 4, 0, 5, -9, 2, -6, 5, 3, -5};
        Sorter<Integer> sorter = createSorter();
        sorter.sort(array);
        assertArrayEquals(new Integer[]{-9, -6, -5, -1, 0, 2, 3, 3, 4, 5, 5}, array);
    }

    /**
     * Tests sorting a large array. This test is intended to verify the algorithm's performance and stability under larger datasets.
     */
    @Test
    public void testLargeArray() {
        Integer[] array = new Integer[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - i;
        }
        Sorter<Integer> sorter = createSorter();
        sorter.sort(array);
        for (int i = 1; i <= array.length; i++) {
            assertEquals(Integer.valueOf(i), array[i - 1]);
        }
    }

    /**
     * Tests sorting an array of Strings. Verifies that the algorithm can sort objects other than numbers, provided they are Comparable.
     */
    @Test
    public void testStringArray() {
        String[] array = {"banana", "apple", "pear", "orange"};
        Sorter<String> sorter = createSorter();
        sorter.sort(array);
        assertArrayEquals(new String[]{"apple", "banana", "orange", "pear"}, array);
    }
}
