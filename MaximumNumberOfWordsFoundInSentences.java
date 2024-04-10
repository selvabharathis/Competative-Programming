import java.util.Scanner;

public class MaximumNumberOfWordsFoundInSentences {
    public static int mostWordsFound(String[] sentences) {
        int maxWordFound = 0;
        for(String sentence : sentences) {
            String[] words = sentence.split(" ");
            if(maxWordFound < words.length)
                maxWordFound = words.length;
        }
        return maxWordFound;
    }

    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of elements to store in array");
        int n = ip.nextInt();

        String[] arr = new String[n];

        System.out.println("Enter the element of array");
        for(int i=0; i<n; i++)
            arr[i] = ip.next();

        System.out.println(mostWordsFound(arr));

        ip.close();
    }
}
