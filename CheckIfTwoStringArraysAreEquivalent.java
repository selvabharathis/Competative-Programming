import java.util.Scanner;

public class CheckIfTwoStringArraysAreEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String firstWord = "", secondWord = "";
        for(String word : word1) {
            firstWord = firstWord.concat(word);
        }
        for(String word : word2) {
            secondWord = secondWord.concat(word);
        }
        if(firstWord.equals(secondWord))
            return true;
        else
            return false;

    }

    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number of elements to store in array");
        int n = ip.nextInt();

        String[] wordOne = new String[n];
        String[] wordTwo = new String[n];
        System.out.println("Enter the element of array");
        for(int i=0; i<n; i++)
            wordOne[i] = ip.next();

        System.out.println("Enter the element of index array");
        for(int i=0; i<n; i++)
            wordTwo[i] = ip.next();

        System.out.println(arrayStringsAreEqual(wordOne,wordTwo));

        ip.close();
    }
}
