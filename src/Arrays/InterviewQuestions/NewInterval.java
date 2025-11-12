package Arrays.InterviewQuestions;

import java.util.ArrayList;
import java.util.*;

public class NewInterval {

    int start;
    int end;

    public NewInterval(int s, int e) {
        start = s;
        end = e;
    }

    @Override
    public String toString() {
        return "(" + start +
                ", " + end +
                ')';
    }
}

class NewIntervalInsertion {

    public static ArrayList<NewInterval> solve(ArrayList<NewInterval> intervals, NewInterval newInterval) {

        ArrayList<NewInterval> ans = new ArrayList<NewInterval>();
        int n = intervals.size();

//        int currStart = intervals.get(0).start;
//        int currEnd = intervals.get(0).end;

        for(int i=0;i<n;i++) {

            if(newInterval.start > intervals.get(i).end) { // curr interval comes first
                ans.add(intervals.get(i));
            } else if(intervals.get(i).start>newInterval.end) {
                //new interval comes first and also properly inserted
                ans.add(newInterval);
                for(int j=i;j<n;j++) {
                    // add remaining intervals in the list
                    ans.add(intervals.get(j));
                }
                return ans;
            } else { // overlapping condition
                newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
                newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
            }
        }

        ans.add(newInterval);

        return ans;
    }
}

class Tester1{

    public static void main(String[] args) {

        ArrayList<NewInterval> intervals = new ArrayList<NewInterval>(List.of(
                new NewInterval(1,3),
                new NewInterval(4,7),
                new NewInterval(10,14),
                new NewInterval(16,19),
                new NewInterval(21,24),
                new NewInterval(27,30),
                new NewInterval(32,35),
                new NewInterval(38,41),
                new NewInterval(43,50)
        ));

        ArrayList<NewInterval> intervals1 = new ArrayList<NewInterval>(List.of(
                new NewInterval(1,5),
                new NewInterval(8,10),
                new NewInterval(11,14),
                new NewInterval(15,20),
                new NewInterval(21,24)
        ));

        System.out.println(intervals);

        System.out.println(NewIntervalInsertion.solve(intervals, new NewInterval(12,22)));
        System.out.println(NewIntervalInsertion.solve(intervals1, new NewInterval(12,24)));
    }
}
