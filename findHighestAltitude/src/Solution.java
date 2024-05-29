public class Solution {

    public static int largestAltitude(int[] gain) {
//        Input: gain = [52,-91,72]
//        Output: 0
//        Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
        int sum = 0,alt = 0;
        for(int i : gain){
            if(alt <= sum){
                alt = sum;
                sum = sum +i;
            }else{
                sum = sum +i;
            }
        }
        return alt>sum ? alt:sum;
    }
}
