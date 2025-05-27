package Matrix.Basic;

import java.util.ArrayList;
import java.util.List;

public class RowWiseSum {

    public static List<Integer> solve(int[][] arr) {
        //row
        int n= arr.length;
        //column
        int m= arr[0].length;
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0; i<n; i++) {
            int rowsum = 0;
            for(int j=0; j<m; j++) {
                rowsum += arr[i][j];
            }
            al.add(rowsum);
        }
        return al;
    }

    public static void main(String[] args) {
        int[][] B = {{1,2,3,4},{5,6,7,8},{9,2,3,4}};
        // ans= {4, 3, 6, 0, -1, 5, 2, 7}
        System.out.println((solve(B)));
    }
}
