import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 * Provides structural unit tests for the {@link MergeSort} implementation of the {@link Sorter} interface.
 * This class ensures the correct operation of the QuickSort algorithm across a variety of input scenarios,
 * including special cases such as empty arrays, single-element arrays, arrays with an even or odd number of elements,
 * arrays containing duplicate values, negative numbers, and mixed positive and negative numbers.
 * author Tom
 */
public class QuickSortStructuralTest {
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
    public void testQuickSortWithTwoElements() {
        Sorter<Integer> sorter = createSorter();
        Integer[] array = {2, 1};
        sorter.sort(array);
        assertArrayEquals(new Integer[]{1, 2}, array);
    }

    @Test
    public void testQuickSortWithAllEqualElements() {
        Sorter<Integer> sorter = createSorter();
        Integer[] array = {1, 1, 1, 1};
        sorter.sort(array);
        assertArrayEquals(new Integer[]{1, 1, 1, 1}, array);
    }

    @Test
    public void testQuickSortWithReverseOrder() {
        Sorter<Integer> sorter = createSorter();
        Integer[] array = {4, 3, 2, 1};
        sorter.sort(array);
        assertArrayEquals(new Integer[]{1, 2, 3, 4}, array);
    }

    @Test
    public void testQuickSortRecursiveCallDepth() {
        Sorter<Integer> sorter = createSorter();
        Integer[] array = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};
        sorter.sort(array);
        assertArrayEquals(new Integer[]{2, 3, 5, 6, 7, 9, 10, 11, 12, 14}, array);
    }

}
