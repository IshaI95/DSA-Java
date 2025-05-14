package Arrays.Basic;

import java.util.Arrays;

public class TwoSumTwoPointer {

    public static boolean isTwoSumExist(int[] arr, int sum) {
        Arrays.sort(arr);
        int n = arr.length;
        int l=0;
        int r=n-1;

        for(int i=0; i<n; i++) {
            if(arr[l] + arr[r] == sum) {
                return true;
            } else if (arr[l] + arr[r] < sum) {
                l++;
            } else {
                r--;
            }
        }
        return false;
    }

    public static int[] getTwoSumpair(int[] arr, int sum) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        Arrays.sort(arr);
        int n = arr.length;
        int l=0;
        int r=n-1;

        for(int i=0; i<n; i++) {
            if(arr[l] + arr[r] == sum) {
                ans[0] = arr[l];
                ans[1] = arr[r];
                return ans;
            } else if (arr[l] + arr[r] < sum) {
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, 5, 2, 7, 4, 3, 6};
        int sum = 12;
        // ans= {4, 3, 6, 0, -1, 5, 2, 7}
        System.out.println(isTwoSumExist(arr,sum));
        System.out.println(Arrays.toString(getTwoSumpair(arr,sum)));
    }
}

//TC: O(N) + O(N*logN) = O(N)
//SC: O(1)
