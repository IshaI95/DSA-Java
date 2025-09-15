package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountDistinctPairsWithKDifferenceTwoPointers {
    public static int solve(int[] A, int B) {
        Arrays.sort(A);

        int i=0, j =1, diff=0, count = 0;

        while(j<A.length) {
            diff = A[j] - A[i];
            if(i==j){
                j++;
            }
            else if(diff == B) {
                count++;
                j++;
                while(j<A.length && A[j] == A[j-1]) {
                    j++;
                }
            } else if(diff>B) {
                i++;
            }
            else{
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] A = {1, 5, 3, 4, 2};

        int B = 3;
        System.out.println(solve(A,B));

        int[] A1 = {8, 12, 16, 4, 0, 20};

        int B1 = 4;
        System.out.println(solve(A1,B1));

        int[] A2 = {1, 1, 1, 2, 2};
        int B2 = 0;
        System.out.println(solve(A2,B2));

    }
}
