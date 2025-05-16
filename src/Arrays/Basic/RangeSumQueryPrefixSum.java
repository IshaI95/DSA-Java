package Arrays.Basic;

import java.util.Arrays;

public class RangeSumQueryPrefixSum {

    public static long[] getSumInRange(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;

        long[] ps = new long[n];
        long[] result = new long[m];

        for(int i=0; i<n; i++) {
            if(i==0) {
                ps[i] = A[0];
            } else {
                ps[i] = ps[i-1] + A[i];
            }
        }

        for(int j=0; j<m; j++) {
            int s = B[j][0];
            int e = B[j][1];

            if(s==0) {
                result[j] = ps[e];
            } else {
                result[j] = ps[e] - ps[s-1];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {{0, 3}, {1, 2}};
        // ans= {4, 3, 6, 0, -1, 5, 2, 7}
        System.out.println(Arrays.toString(getSumInRange(A, B)));
    }
}

// TC: O(n+m)
// SC: O(n)
