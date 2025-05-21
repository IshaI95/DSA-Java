package Arrays.Basic;

public class PickFromBothSides {

    public static int getMaximumSum(int[] arr, int B) {
        int n = arr.length;
        int[] prefSum = new int[n];
        int[] suffSum = new int[n];

        prefSum[0] = arr[0];
        suffSum[n-1] = arr[n-1];

        for(int i=1; i<n; i++) {
            prefSum[i] = prefSum[i-1] + arr[i];
        }

        for(int j=n-2; j>=0; j--) {
            suffSum[j] = suffSum[j+1] + arr[j];
        }

        int maxSum = Math.max(prefSum[B-1], suffSum[n-B]);

        for(int i=1; i<B; i++) {
            int sum = prefSum[i-1] + suffSum[n-B+i];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, -2, 3 , 1, 2}; //8
        int[] arr2 = {2, 3, -1, 4, 2, 1}; //9

        System.out.println(getMaximumSum(arr1, 3));
        System.out.println(getMaximumSum(arr2, 4));
    }
}

// TC: O(N)
// SC: O(N)
