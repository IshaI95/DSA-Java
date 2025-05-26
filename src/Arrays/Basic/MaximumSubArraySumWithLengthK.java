package Arrays.Basic;

public class MaximumSubArraySumWithLengthK {

    public static int solve(int[] arr, int k) {
        int n= arr.length;
        int sum=0, ans = Integer.MIN_VALUE;

        int s=0, e=k-1;

        for(int i=0; i<=e; i++) {
            sum+=arr[i];
        }
        ans = Math.max(ans, sum);
        s++;
        e++;

        while(e<n) {
            sum= sum + arr[e] - arr[s-1];
            s++;
            e++;
            ans = Math.max(ans, sum);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {-3, 4, -2, 5, 3 , -2, 8, 2}; //8

        System.out.println(solve(arr1, 5));
    }
}
