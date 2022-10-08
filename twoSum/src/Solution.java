public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // nums = [2,7,11,15], target = 9
        int size = nums.length;
        int [] solution = new int[2];
        for (int i = 0; i < size-1; i++) {
            for (int j = i+1; j <size;j++){
                if(nums[i]+nums[j]==target){
                    solution[0]=i;
                    solution[1]=j;
                    return solution;
                }
            }
        }
        return new int[]{0};
    }
}
