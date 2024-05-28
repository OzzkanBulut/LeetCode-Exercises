import java.util.Arrays;

public class Solution {
    public static int lengthOfLastWord(String s) {
        int size = s.length();
        int counter = 0,isInside=0;
        for(int i =size-1;i>=0;i-- ){
            if(s.charAt(i)!=' '){                       // String s = "luffy is still joyboy    "
                counter++;
                isInside = 1;
            }
            if(s.charAt(i)==' ' && isInside==1){
                return  counter;
            }
        }
        return counter;

    }
}
