package Arrays.Basic;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumHashing {

    public static boolean isTwoSumExist(int[] arr, int sum) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i =0; i<arr.length; i++) {
            int num = arr[i];
            int target = sum - num;
            if(hm.containsKey(target)) {
                return true;
            }
            hm.put(arr[i],i);
        }

        return false;
    }

    public static int[] getTwoSumpair(int[] arr, int sum) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i =0; i<arr.length; i++) {
            int num = arr[i];
            int target = sum - num;
            if(hm.containsKey(target)) {
                ans[0] = target;
                ans[1] = num;
                return ans;
            }
            hm.put(arr[i],i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, 5, 2, 7, 4, 3, 6};
        int sum = 9;
        // ans= {4, 3, 6, 0, -1, 5, 2, 7}
        System.out.println(isTwoSumExist(arr,sum));
        System.out.println(Arrays.toString(getTwoSumpair(arr,sum)));
    }
}

//TC: O(N)
//SC: O(N)
