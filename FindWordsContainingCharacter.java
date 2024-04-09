import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindWordsContainingCharacter {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indices = new ArrayList<>();
        for(int i=0; i<words.length ; i++) {
            if(words[i].contains(Character.toString(x))) {
                indices.add(i);
            }
        }
        return indices;
    }
    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of elements to store in array");
        int n = ip.nextInt();

        String[] arr = new String[n];

        System.out.println("Enter the element of array");
        for(int i=0; i<n; i++)
            arr[i] = ip.next();

        System.out.println("Enter the character to find");
        String c = ip.next();

        System.out.println(findWordsContaining(arr, c.charAt(0)));

        ip.close();
    }
}
