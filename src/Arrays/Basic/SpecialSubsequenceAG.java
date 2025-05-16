package Arrays.Basic;

public class SpecialSubsequenceAG {

    public static int countAGPairs(String A) {
        int countAG=0, countA=0;
        int mod = 1000000007;
        int n = A.length();

        for(int i=0; i< n; i++) {
            if(A.charAt(i) == 'A') {
                countA++;
            } else if(A.charAt(i) == 'G'){
                countAG+=countA;
                countAG%=mod;
            }
        }
        return countAG;
    }

    public static void main(String[] args) {
        String A = "ABCGAG";
        System.out.println(countAGPairs(A));
        System.out.println(countAGPairs("GAB"));
    }
}

//TC: O(N)
//SC: O(1)
