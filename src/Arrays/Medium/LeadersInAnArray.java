package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class LeadersInAnArray {

    public static int[] solve(int[] arr) {

        ArrayList<Integer> A = new ArrayList<>();
        int n = arr.length;
        int maxElement = arr[n-1];
        A.add(maxElement);
        for(int i = n-2; i>=0; i--) {
            if(arr[i] > maxElement) {
                maxElement = arr[i];
                A.add(maxElement);
            }
        }

        // Convert arraylist to arr
        return A.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2}; //1
        int[] arr2 = {2, 6, 1, 6, 9}; //3
        int[] arr3 = {17, 2, 5};
        int[] arr4 = {1, 4, 5, 2, 4};

        System.out.println(Arrays.toString(solve(arr1)));
        System.out.println(Arrays.toString(solve(arr2)));
        System.out.println(Arrays.toString(solve(arr3)));
        System.out.println(Arrays.toString(solve(arr4)));
    }
}

//TC:O(N)
//SC:O(1)
