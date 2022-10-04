import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] nums = new int[] {1,2,3,2,3}; // 03 04 25 34
        int size = nums.length;
        int count = 0;
        for(int i = 0 ; i<size-1;i++){
            for(int j = i+1;j<size;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        System.out.println(count);


    }
}