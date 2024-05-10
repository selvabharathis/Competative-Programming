public class SortingTheSentence {
    public static String sortSentence(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ");
        // bubble sort
        for(int i = 0; i < words.length - 1; i++) {
            for(int j=0; j < words.length - i -1; j++) {
                if(words[j].charAt(words[j].length()-1) > words[j+1].charAt(words[j+1].length()-1)) {
                    String temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
        }
        for(int i=0; i<words.length; i++) {
            result.append(words[i].substring(0,words[i].length()-1));
            if(i != (words.length-1))
                result.append(" ");
        }
        return result.toString();
    }
    public static void main(String args[]){
        System.out.println("Result: "+ sortSentence("Let's take LeetCode contest"));
    }
}
