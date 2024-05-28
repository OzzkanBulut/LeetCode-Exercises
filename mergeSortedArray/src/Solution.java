import java.util.Arrays;

public class Solution {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

//        int[] nums1 = {-1,0,0,3,3,3,0,0,0};
//        int m = 6;
//        int[] nums2 = {1,2,2};
//        int n = 3;
        int counter = 0;
        for(int i=0;i< nums1.length;i++){
            if(nums1[i]==0){
                if(counter==nums2.length){
                    break;
                }
                nums1[i]=nums2[counter];
                counter++;
            }
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));




    }
}
