public class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String element : operations) {
            switch (element) {
                case "++X":
                case "X++":
                    x++;
                    break;
                case "--X":
                case "X--":
                    x--;
                    break;
            }
        }
        return x;

    }
}
