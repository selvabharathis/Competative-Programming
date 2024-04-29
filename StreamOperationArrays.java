import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class StreamOperationArrays {
    /*
    * Strean are used to process elements on demand in a chain of method calls.
    *
    * Intermediate Operations: operation can be chained together to form a pipeline for processing elements.
    * filter, map, mapToInt, flatMap, distinct, sorted, limit, skip etc.
    *
    * Terminal Operations: Operations that terminate a stream pipeline and produce a result.
    * count, min, max, anyMatch, forEach, collect, reduce, toList, toSet, toArray
    *
    * parallel stream: stream can be proceed in parallel to take advantage of multi-core processors.
    * This can be acheived by invoking parallel() method on a stream.
    * */
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] filteredArr = Arrays.stream(arr)
                .filter(x -> x % 2 == 0) // Keep only even numbers
                .toArray();

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] mappedArr = Arrays.stream(arr1)
                .map(x -> x * x) // Square each element
                .toArray();


        int[] arr2 = {3, 1, 4, 1, 5, 9, 2, 6};
        int[] sortedArr = Arrays.stream(arr2)
                .sorted() // Sort elements in natural order
                .toArray();

        int[] sortedArrDescending = Arrays.stream(arr2)
                .boxed() // Convert int to Integer for reversed comparator
                .sorted(Comparator.reverseOrder()) // Sort elements in descending order
                .mapToInt(Integer::intValue) // Convert back to int
                .toArray();

        int[] arr3 = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(arr3)
                .reduce(0, Integer::sum); // Calculate sum

        int[] arr4 = {1, 2, 3, 4, 5};
        long count = Arrays.stream(arr4)
                .count(); // Count the number of elements

        int[] arr5 = {1, 2, 3, 4, 5};
        int[] skippedAndLimitedArr = Arrays.stream(arr5)
                .skip(2) // Skip the first two elements
                .limit(3) // Limit to the next three elements
                .toArray();

        // convert array list to int array
        ArrayList<Integer> resultArray = new ArrayList<>();
        int[] intArray = resultArray.stream().mapToInt(Integer::intValue).toArray();

        int[] arr6 = new int[]{1,2,3,4,5};
        // convert primitive int to a object Integer wrapper class
        Integer[] integerArray = IntStream.of(arr6).boxed().toArray(Integer[]::new); // instead IntStream.of we can use Arrays.stream()
        // convert Integer Object array to array List
        List<Integer> myList = Arrays.asList(integerArray);

    }
}
