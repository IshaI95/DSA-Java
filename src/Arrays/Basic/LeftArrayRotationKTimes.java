package Arrays.Basic;

import java.util.Arrays;

public class LeftArrayRotationKTimes {

    public static int[] rotateArray(int[] arr, int K) {
        int n = arr.length;
        K=K%n;
        reversePart(arr, 0, n-1);
        reversePart(arr, 0, K-1);
        reversePart(arr, K, n-1);
        return arr;
    }

    public static void reversePart(int[] arr, int l, int r) {
        while(l<r) {
            int temp=arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, 5, 2, 7, 4, 3, 6};
        int B = 5;
        // ans= {4, 3, 6, 0, -1, 5, 2, 7}
        System.out.println(Arrays.toString(LeftArrayRotationKTimes.rotateArray(arr, B)));
    }
}
