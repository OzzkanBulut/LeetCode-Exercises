public class Solution {
    public boolean isPalindrome(int x) {
        int remainder=0,reverse=0,temp=x;

        while(temp>0){
            remainder= temp%10;
            reverse = (reverse*10)+remainder;
            temp = temp/10;
        }

        if(reverse==x){
            return true;
        }
        else
            return false;

    }
}
