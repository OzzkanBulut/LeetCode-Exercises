import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,2,6,-1,4,1,8,2};
        int k = 5;
        System.out.println(Arrays.toString(Solution.findAverages(arr, k)));
    }
}