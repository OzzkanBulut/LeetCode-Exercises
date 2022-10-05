public class Solution {
    public int removeElement(int[] nums, int val) {
        // {3,2,2,3} 3  Output: 2, nums = [2,2,_,_]
        int size = nums.length;
        int k = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] == val) {
                nums[i] = -367;
            } else {
                k++;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums[i] == -367) {
                    if (nums[j] != -367) {
                        nums[i] = nums[j];
                        nums[j] = -367;
                    }
                }
            }
        }
        return k;
    }
}

