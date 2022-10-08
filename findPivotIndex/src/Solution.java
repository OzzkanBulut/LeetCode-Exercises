public class Solution {
    public int pivotIndex(int[] nums) {

        int size = nums.length;
        int answer = -23;

        for (int i = 0; i < size; i++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum = leftSum + nums[j];
            }
            for (int k = size - 1; k > i; k--) {
                rightSum = rightSum + nums[k];
            }
            if (i == 0 & rightSum == 0) {
                answer = 0;
                break;
            }

            if (rightSum == leftSum) {
                System.out.println(leftSum + " " + rightSum);
                answer = i;
                break;
            } else {
                answer = -1;
            }

        }
        return answer;
    }
}
