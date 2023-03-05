import java.util.Arrays;

public class Solution {
    public int majorityElement(int[]nums){
//    1 2 3 3 3 3
        Arrays.sort(nums);
        return nums[(nums.length-1)/2];



    }
}
