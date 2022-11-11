public class Solution {

    public static int[] runningSum(int[] nums) {
        int tmp = 0;
        for(int i = 0 ; i<nums.length;i++){
            nums[i] = nums[i]+tmp;
            tmp = nums[i];

        }
        return nums;

    }
}
