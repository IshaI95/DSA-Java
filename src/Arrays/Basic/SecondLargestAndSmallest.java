package Arrays.Basic;

public class SecondLargestAndSmallest {

    public static int findSecondLargest(int[] arr) {

        int n = arr.length;
        int first_largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        if(n<2) {
            return -1;
        }

        for(int i=0; i<n; i++) {

            if(arr[i] > first_largest) {
                second_largest=first_largest;
                first_largest=arr[i];
            } else if (arr[i] > second_largest && arr[i] != first_largest) {
                second_largest = arr[i];
            }
        }

        return second_largest;
    }

    public static int findSecondSmallest(int[] arr) {

        int n = arr.length;
        int first_smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;

        if(n<2) {
            return -1;
        }

        for (int j : arr) {

            if (j < first_smallest) {
                second_smallest = first_smallest;
                first_smallest = j;
            } else if (j < second_smallest && j != first_smallest) {
                second_smallest = j;
            }
        }

        return second_smallest;
    }


    public static void main(String[] args) {
        int[] arr = {0, -1, 5, 2, 7, 4, 3, 6};
        System.out.println(SecondLargestAndSmallest.findSecondLargest(arr));
        System.out.println(SecondLargestAndSmallest.findSecondSmallest(arr));
    }
}

// TC: O(N)
// SC: O(1)
