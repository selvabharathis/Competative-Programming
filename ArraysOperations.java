import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArraysOperations {
    public static void main(String args[]) {

        int[] arr = new int[]{1,2,3,4,5};

        // convert primitive int to a object Integer wrapper class
        Integer[] integerArray = IntStream.of(arr).boxed().toArray(Integer[]::new);
        // convert Integer Object array to array List
        List<Integer> myList = Arrays.asList(integerArray);

        int[] myArr = {3, 1, 4, 1, 5, 9, 2, 6};
        Arrays.sort(myArr); // Sorts the array in ascending order

        int[] myArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = Arrays.binarySearch(myArr2, 5); // Searches for the value 5 in the array

        int[] source = {1, 2, 3, 4, 5};
        int[] destination = Arrays.copyOf(source, source.length); // Copies the elements of source to destination


        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean isEqual = Arrays.equals(arr1, arr2); // Checks if the two arrays are equal

        int[] arr3 = new int[5];
        Arrays.fill(arr3, 10); // Fills the array with the value 10

        int[] arr4 = {1, 2, 3, 4, 5};
        String str = Arrays.toString(arr4); // Converts the array to a string


    }
}
