package TwoPointers;

//Given an array ofpositive integers A and an integer B,
//find and return first continuous subarray which adds to B.
//If the answer does not exist return an array with a single integer "-1".
//  A = [1, 2, 3, 4, 5]
// B = 5
// Two Pointers and sliding window
// TC: O(N), SC:O(1)
// Bruteforce: O(N3), go to all subarrays and calculate sum

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayWithGivenSum {

    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<>();

        int n = A.size();
        int sum = 0;
        int l = 0;

        for(int r =0; r<n; r++) {
            sum += A.get(r);

            while(sum>B) {
                sum = sum - A.get(l);
                l++;
            }

            if(sum == B) {
                for(int k=l;k<=r;k++) {
                    result.add(A.get(k));
                }
                return result;
            }
        }
        result.add(-1);
        return result;
    }

    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(1, 10, 11, 13, 14, 16, 20);

        ArrayList<Integer> nums = new ArrayList<>(lst);

        int B= 38;

        System.out.println(solve(nums,B));
    }
}
