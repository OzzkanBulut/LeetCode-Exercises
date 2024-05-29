public class Solution {

    public static String mergeAlternately(String word1, String word2) {
        // word1 = "abcd", word2 = "pq"
        String solution = "";
        int i = 0;

        while(i<word1.length() || i <word2.length()){
            if(i<word1.length()){
                solution = solution + word1.charAt(i);
            }
            if(i < word2.length()){
                solution = solution+ word2.charAt(i);
            }
            i++;
        }
        return solution;



    }
}
