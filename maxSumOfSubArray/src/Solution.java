public class Solution{
//Problem: Given an array of positive numbers and a positive number K,
//find the maximum sum of any contiguous subarray of size K.
//
//        Example:
//
//Input: [2, 1, 5, 1, 3, 2], K=3
//Output: 9 (subarray [5, 1, 3] has the maximum sum)
//Please write your solution, and I'll evaluate it for you.

public static int sumofSub(int[] arr, int k){
    int sum = 0;
    int windowStart = 0;
    int max = sum;
    for(int windowEnd=0;windowEnd<k;windowEnd++){
        sum = sum + arr[windowEnd];
    }

    for(int windowEnd=k;windowEnd<arr.length;windowEnd++){
        sum = sum + arr[windowEnd]-arr[windowStart];
        windowStart++;
        if(sum>max){
            max = sum;
        }

    }
    return max;



}




}
