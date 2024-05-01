import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Provides structural unit tests for the {@link MergeSort} implementation of the {@link Sorter} interface.
 * This class ensures the correct operation of the MergeSort algorithm across a variety of input scenarios,
 * including special cases such as empty arrays, single-element arrays, arrays with an even or odd number of elements,
 * arrays containing duplicate values, negative numbers, and mixed positive and negative numbers.
 * author Tom
 */
public class MergeSortStructuralTest {
    /**
     * Factory method to create a new instance of {@link MergeSort}.
     * This method is utilized to instantiate a new {@link MergeSort} object for testing purposes.
     *
     * @param <T> The type parameter for the objects to be sorted, which must extend {@link Comparable}.
     * @return A new instance of {@link MergeSort}.
     */
    private <T extends Comparable<T>> Sorter<T> createSorter() {
        return new QuickSort<>();
    }
    @Test
    public void testMergeSortWithEmptyArray() {
        Sorter<Integer> sorter = createSorter();
        Integer[] array = {};
        sorter.sort(array);
        assertArrayEquals(new Integer[]{}, array, "Should handle empty arrays correctly.");
    }

    @Test
    public void testMergeSortWithSingleElement() {
        Sorter<Integer> sorter = createSorter();
        Integer[] array = {1};
        sorter.sort(array);
        assertArrayEquals(new Integer[]{1}, array, "Single element arrays should remain unchanged.");
    }

    @Test
    public void testMergeSortWithTwoElements() {
        Sorter<Integer> sorter = createSorter();
        Integer[] array = {2, 1};
        sorter.sort(array);
        assertArrayEquals(new Integer[]{1, 2}, array, "Should correctly sort an array of two elements.");
    }

    @Test
    public void testMergeSortWithEvenNumberOfElements() {
        Sorter<Integer> sorter = createSorter();
        Integer[] array = {4, 1, 3, 2};
        sorter.sort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4}, array, "Should correctly sort arrays with an even number of elements.");
    }

    @Test
    public void testMergeSortWithOddNumberOfElements() {
        Sorter<Integer> sorter = createSorter();
        Integer[] array = {5, 3, 4, 1, 2};
        sorter.sort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array, "Should correctly sort arrays with an odd number of elements.");
    }

    @Test
    public void testMergeSortWithDuplicates() {
        Sorter<Integer> sorter = createSorter();
        Integer[] array = {5, 2, 3, 5, 1, 2};
        sorter.sort(array);
        assertArrayEquals(new Integer[]{1, 2, 2, 3, 5, 5}, array, "Should correctly handle arrays with duplicate elements.");
    }

    @Test
    public void testMergeSortWithNegativeNumbers() {
        Sorter<Integer> sorter = createSorter();
        Integer[] array = {-3, -1, -2, -4};
        sorter.sort(array);
        assertArrayEquals(new Integer[]{-4, -3, -2, -1}, array, "Should correctly sort arrays containing negative numbers.");
    }

    @Test
    public void testMergeSortWithMixedNumbers() {
        Sorter<Integer> sorter = createSorter();
        Integer[] array = {3, -1, 4, -1, 5, -9, 2, 6, -5, 3, 5};
        sorter.sort(array);
        assertArrayEquals(new Integer[]{-9, -5, -1, -1, 2, 3, 3, 4, 5, 5, 6}, array, "Should correctly sort arrays with mixed positive and negative numbers.");
    }
}
