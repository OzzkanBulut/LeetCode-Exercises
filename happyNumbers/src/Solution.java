public class Solution {
    public boolean calculate(int number) {
        // happy number int n
        int n = 13;
        int temp = n, prevtemp = n;

        int count = 0;
        while (temp != 1) {
            int sum = 0;
            prevtemp = temp;
            while (temp != 0) {
                sum = sum + (temp % 10) * (temp % 10);
                temp = temp / 10;
            }
            temp = sum;
            if (temp == prevtemp) {
                return false;
            }
            count++;
            if (count == 100) {
                return false;
            }
        }
        return true;


    }


}