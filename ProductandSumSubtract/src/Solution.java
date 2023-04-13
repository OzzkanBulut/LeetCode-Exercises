public class Solution {

    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        int result = 0;
        int temp = 0;
        int backn = n;
        while(n>0){
            temp = n % 10;
            n = n / 10;
            product = product * temp;
        }
        temp = 0;
        while(backn>0){
            temp = backn % 10;
            backn = backn/10;
            sum = sum + temp;
        }
        result = product - sum;
        return result;
    }
}
