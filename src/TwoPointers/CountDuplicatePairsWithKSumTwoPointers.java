package TwoPointers;

public class CountDuplicatePairsWithKSumTwoPointers {

    public static int solve(int[] A, int B) {
        int n = A.length;
        long count = 0;
        int i=0, j =n-1;
        final int MOD = 1000000007;


        while(i<j) {
            if(A[i] + A[j] == B) {
                if(A[i]!=A[j]) {
                    int x = A[i];
                    int y = A[j];
                    int cntX = 0;
                    int cntY = 0;

                    i++;
                    j--;
                    cntX++;
                    cntY++;

                    while(i<n && A[i] == x) {
                        i++;
                        cntX++;
                    }
                    while(j>-1 && A[j] == y) {
                        j--;
                        cntY++;
                    }

                    count += ((cntX * cntY)%MOD)%MOD;

                }
                else {

                    long cnt = j-i+1;
                    count += (((cnt *(cnt-1))/2)%MOD)%MOD;
                    break;
                }
            }
            else if(A[i] + A[j] <B) {
                i++;
            } else {
                j--;
            }
        }
        return (int)count%MOD;
    }

    public static void main(String[] args) {
        int[] A = {1, 1, 1};

        int B = 2;
        System.out.println(solve(A,B));

        int[] A1 = {1, 5, 7, 10};

        int B1 = 8;
        System.out.println(solve(A1,B1));

        int[] A2 = {1, 1, 1, 2, 2};
        int B2 = 3;
        System.out.println(solve(A2,B2));
    }

}

