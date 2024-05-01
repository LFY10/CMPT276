/**
 * Defines a generic sorting algorithm interface for sorting arrays of objects that implement the {@link Comparable} interface.
 * Implementations of this interface are expected to provide a specific sorting algorithm, such as QuickSort, MergeSort, or any other
 * sorting algorithm. The interface is designed to be flexible, allowing for the sorting of any type of objects that can be compared to
 * each other, making it useful for a wide range of sorting applications.
 *
 * @param <T> the type of objects that can be sorted by implementations of this interface. It must extend {@link Comparable} to ensure
 *            that the objects can be compared to each other, which is a prerequisite for sorting.
 * @author Tom
 */
public interface Sorter<T extends Comparable<T>> {
    /**
     * Sorts the specified array of objects of type T. The method is expected to modify the array in-place, arranging the objects
     * in ascending order according to their natural ordering (as defined by their {@link Comparable#compareTo(Object)} method).
     * Implementations of this method should ensure that the sort is performed efficiently and correctly, according to the specific
     * sorting algorithm they represent.
     *
     * @param list the array of objects to be sorted. The objects in the array must implement the {@link Comparable} interface.
     *             The array must not be null, but it may be empty. Modifications to the array during sorting are done in-place,
     *             meaning that the array passed as an argument will be sorted by the time the method returns.
     */
    void sort(T[] list);
}
