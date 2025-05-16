package Arrays.Medium;

public class ClosestMinMax {

    public static int getClosestMinmaxSubArrLength(int[] arr) {

        int n = arr.length;

        int lastMinIdx = -1;
        int lastMaxIdx = -1;

        int minEle = Integer.MAX_VALUE;
        int maxEle = Integer.MIN_VALUE;

        int ans = Integer.MAX_VALUE;

        for(int i=0;i<n;i++) {
            minEle = Math.min(minEle,arr[i]);
            maxEle = Math.max(maxEle, arr[i]);
        }

        for(int i=0;i<n;i++) {
            if(arr[i] == minEle) {
                if(lastMaxIdx!=-1) {
                    ans = Math.min(ans, i-lastMaxIdx+1);
                }
                lastMinIdx = i;
            } else if(arr[i] == maxEle) {
                if(lastMinIdx!=-1) {
                    ans = Math.min(ans, i-lastMinIdx+1);
                }
                lastMaxIdx = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2}; //1
        int[] arr2 = {2, 6, 1, 6, 9}; //3

        System.out.println(getClosestMinmaxSubArrLength(arr1));
        System.out.println(getClosestMinmaxSubArrLength(arr2));
    }
}
