package Arrays.Medium;

public class BuyAndSellStock {

    public static int maximizeProfit(int[] arr) {
        int n= arr.length;
        int maxProfit = 0;
        int maxElement = Integer.MIN_VALUE;

        for(int i = n-1; i>=0; i--) {
            maxElement = Math.max(maxElement, arr[i]);
            int profit = maxElement - arr[i];
            maxProfit = Math.max(maxProfit,profit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2}; //1
        int[] arr2 = {2, 6, 1, 6, 9}; //3
        int[] arr3 = {1, 2};
        int[] arr4 = {1, 4, 5, 2, 4};

        System.out.println(maximizeProfit(arr1));
        System.out.println(maximizeProfit(arr2));
        System.out.println(maximizeProfit(arr3));
        System.out.println(maximizeProfit(arr4));
    }
}

//TC:O(N)
//SC:O(1)
