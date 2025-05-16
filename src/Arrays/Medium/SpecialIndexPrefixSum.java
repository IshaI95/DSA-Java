package Arrays.Medium;

public class SpecialIndexPrefixSum {

    public static int countSpecialIndex(int[] arr) {
        int n = arr.length;
        int count=0;
        long se=0;
        long so=0;
        long[] pfEven = new long[n];
        long[] pfOdd = new long[n];

        pfEven[0] = arr[0];
        pfOdd[0] = 0;

        //Calculate pfEven and pfOdd
        for(int i=1; i<n; i++) {
            if(i%2==0) {
                pfEven[i] = pfEven[i-1] + arr[i];
                pfOdd[i] = pfOdd[i-1];
            } else {
                pfEven[i] = pfEven[i-1];
                pfOdd[i] = pfOdd[i-1] + arr[i];
            }
        }

        for(int i=0; i<n; i++) {
            se = pfOdd[n-1] - pfOdd[i];
            so = pfEven[n-1] -pfEven[i];
            if(i!=0) {
                se = se + pfEven[i-1];
                so = so + pfOdd[i-1];
            }

            if(se==so) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,1,6,4}; //1
        int[] arr2 = {1,1,1}; //3

        System.out.println(countSpecialIndex(arr1));
        System.out.println(countSpecialIndex(arr2));
    }
}
