import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static double[] findAverages(int[] arr, int k){
//        int[] arr = {1,3,2,6,-1,4,1,8,2};
//        int k = 5;
        double[] result = new double[arr.length -k+1];
        double windowSum = 0;
        int windowStart = 0;

        // Calculate the sum of first window
        for(int windowEnd =0;windowEnd<k;windowEnd++){
            windowSum = windowSum + arr[windowEnd];
        }
        result[0] = windowSum/k;

        for(int windowEnd = k; windowEnd<arr.length;windowEnd++){
            windowSum = windowSum + arr[windowEnd] - arr[windowStart];
            windowStart++;
            result[windowStart] = windowSum/k;

        }

        return result;






    }
}
