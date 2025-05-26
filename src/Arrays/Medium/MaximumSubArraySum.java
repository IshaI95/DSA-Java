package Arrays.Medium;

import java.util.Arrays;

public class MaximumSubArraySum {

    public static int getMaximumSubArraySum(int[] arr) {
        int n= arr.length;
        int sum = 0;
        int ans = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {

            if(sum<0){
                sum = 0;
            }
            sum += arr[i];
            ans = Math.max(ans,sum);
        }
        return ans;
    }

    public static int[] getMaximumSubArraySumIndices(int[] arr) {
        int n= arr.length;
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        int[] result = new int[2];
        int start=0;
        int s=-1, e=-1;

        for(int i=0; i<n; i++) {

//            if(sum==0) {
//                start=i;
//            }
            sum += arr[i];
            if(sum>ans) {
                ans=sum;
                s=start;
                e=i;
            }
            if(sum<0){
                start=i+1;
                sum = 0;
            }
        }
        result[0] = s;
        result[1] = e;
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, -10}; //1
        int[] arr2 = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; //3

        System.out.println(getMaximumSubArraySum(arr1));
        System.out.println(Arrays.toString(getMaximumSubArraySumIndices(arr1)));
        System.out.println(getMaximumSubArraySum(arr2));
        System.out.println(Arrays.toString(getMaximumSubArraySumIndices(arr2)));
    }
}
