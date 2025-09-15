package TwoPointers;

import java.util.*;

public class CountDistinctPairsWithKDifferenceHashing {

    public static int solve(ArrayList<Integer> A, int B) {
        int count=0;
        int n = A.size();

        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int a: A) {
            if(hm.containsKey(a)){
                hm.put(a, hm.get(a) + 1);
            } else {
                hm.put(a, 1);
            }
        }

        if(B==0) {
            for(int a:hm.keySet()) {
                if(hm.get(a)>1) count+=(hm.get(a)-1);
            }
        } else {
            for(int a:hm.keySet()) {
//                int diff = a-B;
//                j-i = k
//                        j=i+k
                int sum = Math.abs(a+B);

//                if(hm.containsKey(diff)) count++;
                if(hm.containsKey(sum)) count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 5, 3, 4, 2);
        ArrayList<Integer> A = new ArrayList<>(list);

        int B = 3;
        System.out.println(solve(A,B));

        List<Integer> list1 = Arrays.asList(8, 12, 16, 4, 0, 20);
        ArrayList<Integer> A1 = new ArrayList<>(list1);

        int B1 = 4;
        System.out.println(solve(A1,B1));

        List<Integer> list2 = Arrays.asList(1, 1, 1, 2, 2);
        ArrayList<Integer> A2 = new ArrayList<>(list2);

        int B2 = 0;
        System.out.println(solve(A2,B2));

    }
}
