import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        for(int i=0; i< heights.length - 1; i++) {
            for(int j=i+1; j < heights.length; j++) {
                // bubble sort in decending order
                if(heights[i] < heights[j]) {
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                    String tempStr = names[i];
                    names[i] = names[j];
                    names[j] = tempStr;
                }
            }
        }
        return names;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortPeople(Stream.of("Mary", "John", "Emma").toArray(String[]::new), IntStream.of(180, 165, 170).toArray())));
    }
}
