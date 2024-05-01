import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Provides unit tests for the {@link MergeSort} implementation of the {@link Sorter} interface.
 * This class tests various scenarios to ensure the correct operation of the MergeSort algorithm across
 * different types of input arrays, including edge cases such as empty arrays, arrays with a single element,
 * arrays that are already sorted, and arrays containing negative numbers or duplicates.
 * @author Tom
 */
public class MergeSortTest {

    /**
     * Creates a sorter instance for testing. This method is a factory for creating instances of {@link MergeSort}.
     *
     * @param <T> the type parameter for objects that can be sorted, extending {@link Comparable}.
     * @return a new instance of {@link MergeSort}.
     */
    private <T extends Comparable<T>> Sorter<T> createSorter() {
        return new MergeSort<>();
    }

    /**
     * Tests the sorting of an empty array. Ensures that the algorithm can handle empty input without errors.
     */
    @Test
    public void testEmptyArray() {
        Integer[] array = {};
        Sorter<Integer> sorter = createSorter();
        sorter.sort(array);
        assertArrayEquals(new Integer[]{}, array);
    }

    /**
     * Tests the sorting of an array containing a single element. Ensures that the algorithm correctly recognizes
     * arrays that are trivially sorted.
     */
    @Test
    public void testSingleElement() {
        Integer[] array = {1};
        Sorter<Integer> sorter = createSorter();
        sorter.sort(array);
        assertArrayEquals(new Integer[]{1}, array);
    }

    /**
     * Tests the sorting of an array that is already sorted. Verifies that the algorithm does not disturb the order
     * of an already sorted array.
     */
    @Test
    public void testSortedArray() {
        Integer[] array = {1, 2, 3, 4, 5};
        Sorter<Integer> sorter = createSorter();
        sorter.sort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    /**
     * Tests the sorting of an array with elements in reverse order. Verifies that the algorithm can sort an array
     * into ascending order from any starting condition.
     */
    @Test
    public void testReverseArray() {
        Integer[] array = {5, 4, 3, 2, 1};
        Sorter<Integer> sorter = createSorter();
        sorter.sort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    /**
     * Tests the sorting of an array containing duplicate elements. Ensures that the algorithm handles duplicates
     * correctly and maintains stable sorting.
     */
    @Test
    public void testArrayWithDuplicates() {
        Integer[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        Sorter<Integer> sorter = createSorter();
        sorter.sort(array);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9}, array);
    }

    /**
     * Tests the sorting of an array containing negative numbers. Verifies that the algorithm correctly sorts arrays
     * with negative values.
     */
    @Test
    public void testNegativeNumbers() {
        Integer[] array = {-5, -1, -3, -2, -4};
        Sorter<Integer> sorter = createSorter();
        sorter.sort(array);
        assertArrayEquals(new Integer[]{-5, -4, -3, -2, -1}, array);
    }

    /**
     * Tests the sorting of an array containing a mix of positive and negative numbers. Ensures the algorithm
     * correctly sorts arrays regardless of the sign of the numbers.
     */
    @Test
    public void testMixedNumbers() {
        Integer[] array = {3, -1, 4, -1, 5, -9, 2, 6, -5, 3, 5};
        Sorter<Integer> sorter = createSorter();
        sorter.sort(array);
        assertArrayEquals(new Integer[]{-9, -5, -1, -1, 2, 3, 3, 4, 5, 5, 6}, array);
    }

    /**
     * Tests the sorting of a large array. This test is designed to verify that the algorithm performs correctly and
     * efficiently on larger data sets.
     */
    @Test
    public void testLargeArray() {
        Integer[] array = new Integer[100];
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
     * Tests the sorting of an array containing Strings. Verifies that the algorithm can sort non-numeric types,
     * provided they implement the Comparable interface.
     */
    @Test
    public void testStringArray() {
        String[] array = {"banana", "apple", "pear", "orange"};
        Sorter<String> sorter = createSorter();
        sorter.sort(array);
        assertArrayEquals(new String[]{"apple", "banana", "orange", "pear"}, array);
    }

    /**
     * Tests the sorting of an array where all elements are equal. Ensures the algorithm handles this scenario
     * without errors, maintaining the order of equal elements.
     */
    @Test
    public void testArrayWithAllEqualElements() {
        Integer[] array = {1, 1, 1, 1, 1};
        Sorter<Integer> sorter = createSorter();
        sorter.sort(array);
        assertArrayEquals(new Integer[]{1, 1, 1, 1, 1}, array);
    }
}
