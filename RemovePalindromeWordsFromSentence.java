import java.util.Scanner;

public class RemovePalindromeWordsFromSentence {
    public static boolean checkPalindromeWordOrNot(String word) {
        for (int reverseIndex = word.length() - 1,
             actualIndex = 0; actualIndex <= reverseIndex; reverseIndex--, actualIndex++) {
            if (word.charAt(actualIndex) != word.charAt(reverseIndex))
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        String userInputString;
        Scanner ip = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("****** Palindrome Menu ******");
            System.out.println("1. Enter input");
            System.out.println("2. Exit");
            System.out.print("Enter your choice = ");
            int userChoice = ip.nextInt();
            ip.nextLine();
            System.out.println();

            switch (userChoice) {
                case 1:
                    System.out.print("Input : ");
                    userInputString = ip.nextLine().trim();
                    String constructedString = "";
                    String[] processingInput = userInputString.split(" ");
                    for (String word : processingInput) {
                        if (!checkPalindromeWordOrNot(word.toLowerCase())) {
                            constructedString = constructedString + " " + word;
                        }
                    }
                    System.out.println("Output: " + constructedString);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Exiting program.");
                    System.out.println();
                    ip.close();
                    System.exit(0);
                    break;
            }
        }
    }
}
