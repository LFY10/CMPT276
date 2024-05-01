/**
 * Implements the Merge Sort algorithm for sorting an array of objects that implement the Comparable interface.
 * This class provides a generic implementation of the Merge Sort algorithm, making it usable with any type of object
 * that extends Comparable, ensuring that the objects can be compared to each other for sorting.
 *
 * @param <T> the type of objects that this sorter can sort. It must extend {@link Comparable}.
 * @author Tom
 */
public class MergeSort<T extends Comparable<T>> implements Sorter<T> {

    /**
     * Sorts the specified array of objects of type T using the Merge Sort algorithm.
     * The sorting is performed in-place, modifying the original array. The algorithm recursively divides
     * the array into two halves, sorts the two halves, and then merges the sorted halves into a single sorted array.
     * If the array contains fewer than two elements, it is considered already sorted, and the method returns immediately.
     *
     * @param list the array of objects to be sorted. The array must not be null, but may be empty.
     */
    @Override
    public void sort(T[] list) {
        if (list.length < 2) {
            return; // The array is already sorted in this case
        }
        int mid = list.length / 2;
        T[] leftHalf = (T[]) new Comparable[mid];
        T[] rightHalf = (T[]) new Comparable[list.length - mid];

        System.arraycopy(list, 0, leftHalf, 0, mid);
        System.arraycopy(list, mid, rightHalf, 0, list.length - mid);

        sort(leftHalf);
        sort(rightHalf);

        merge(list, leftHalf, rightHalf);
    }

    /**
     * Merges two sorted subarrays into a single sorted array. The merge process compares elements of the left
     * and right subarrays and places the smaller of each comparison into the next position of the main array,
     * effectively merging them into a single sorted array. Once all elements from one subarray have been placed,
     * any remaining elements from the other subarray are copied into the main array.
     *
     * @param list the main array that the sorted elements will be merged into. This array is modified in-place.
     * @param leftHalf the first sorted subarray to be merged.
     * @param rightHalf the second sorted subarray to be merged.
     */
    private void merge(T[] list, T[] leftHalf, T[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i].compareTo(rightHalf[j]) <= 0) {
                list[k++] = leftHalf[i++];
            } else {
                list[k++] = rightHalf[j++];
            }
        }

        while (i < leftSize) {
            list[k++] = leftHalf[i++];
        }

        while (j < rightSize) {
            list[k++] = rightHalf[j++];
        }
    }
}
