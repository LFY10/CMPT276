/**
 * Implements the Quick Sort algorithm for sorting an array of objects that implement the Comparable interface.
 * This class provides a generic implementation of the Quick Sort algorithm, making it usable with any type of object
 * that extends Comparable. The algorithm efficiently sorts the objects in ascending order based on their natural ordering.
 *
 * @param <T> the type of objects that this sorter can sort. It must extend {@link Comparable}.
 * @author Tom
 */
public class QuickSort<T extends Comparable<T>> implements Sorter<T> {

    /**
     * Sorts the specified array of objects of type T using the Quick Sort algorithm.
     * The sorting is performed in-place, modifying the original array. The algorithm chooses a pivot element and
     * partitions the other elements into two groups: those less than the pivot and those greater than the pivot.
     * It then recursively sorts the subarrays. This method initiates the recursive quick sort algorithm.
     *
     * @param list the array of objects to be sorted. The array must not be null, but may be empty.
     */
    @Override
    public void sort(T[] list) {
        quickSort(list, 0, list.length - 1);
    }

    /**
     * Recursively sorts the specified subarray using the Quick Sort algorithm.
     * This method chooses a pivot element, partitions the array around the pivot, and recursively sorts the subarrays.
     *
     * @param list the array of objects to be sorted.
     * @param low the starting index of the subarray to be sorted.
     * @param high the ending index of the subarray to be sorted.
     */
    private void quickSort(T[] list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);

            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    /**
     * Partitions the specified subarray around a pivot element. All elements less than the pivot are moved to the left
     * of the pivot, and all elements greater than the pivot are moved to the right. The choice of the pivot and the partitioning
     * strategy can affect the performance of the Quick Sort algorithm.
     *
     * @param list the array of objects to be sorted.
     * @param low the starting index of the subarray to be partitioned.
     * @param high the ending index of the subarray to be partitioned.
     * @return the index of the pivot element after partitioning.
     */
    private int partition(T[] list, int low, int high) {
        T pivot = list[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (list[j].compareTo(pivot) <= 0) {
                i++;
                T temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }

        T temp = list[i + 1];
        list[i + 1] = list[high];
        list[high] = temp;

        return i + 1;
    }
}
