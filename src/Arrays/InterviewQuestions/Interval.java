package Arrays.InterviewQuestions;
import java.util.*;

public class Interval {

    int start;
    int end;

    public Interval() {
        start=0;
        end=0;
    }

    public Interval(int s, int e) {
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

class MergeOverlappingInterval{

    public static ArrayList<Interval> solve(ArrayList<Interval> intervals) {
        int n = intervals.size();
        ArrayList<Interval> ans = new ArrayList<Interval>();
        intervals.sort((s1,s2) -> Integer.compare(s1.start, s2.start));

        int currStart = intervals.get(0).start;
        int currEnd = intervals.get(0).end;

        for(int i=1;i<n;i++) {
            //overlapping interval
            if(intervals.get(i).start <= currEnd) {
                currStart = Math.min(currStart, intervals.get(i).start);
                currEnd = Math.max(currEnd, intervals.get(i).end);
            } else { // non overlapping
                ans.add(new Interval(currStart, currEnd));
                currStart = intervals.get(i).start;
                currEnd = intervals.get(i).end;
            }
        }
        ans.add(new Interval(currStart, currEnd));
        return ans;
    }
}

class Tester {

    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<>(List.of(
                new Interval(0,2),
                new Interval(1,4),
                new Interval(5,6),
                new Interval(6,8),
                new Interval(7,10),
                new Interval(8,9),
                new Interval(12,14)
        ));

//        intervals.forEach(System.out::println);
        System.out.println(intervals);

        ArrayList<Interval> ans = MergeOverlappingInterval.solve(intervals);
        System.out.println("ans = " + ans);
    }
}
