public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int count = 0;
        int size = nums.length;
        int[] positions = new int[2];
        for (int i = 0; i < size; i++) {
            if (nums[i] == target) {
                positions[0] = i;
                count++;
                break;
            }

        }
        for (int i = size - 1; i >= 0; i--) {
            if (nums[i] == target) {
                positions[1] = i;
                break;
            }
        }
        if (count == 0) {
            positions[0] = -1;
            positions[1] = -1;
        }

        return positions;
    }
}
