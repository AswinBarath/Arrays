package scaler_problems;

import java.util.Arrays;
import java.util.Comparator;

public class MergeOverlappingIntervals {
    public Interval[] merge(Interval[] intervals) {
        // Sort the Intervals first using custom comparator:
        // Create a custom comparator to sort strings by their length.
        Comparator<Interval> numComparator = new Comparator<Interval>() {
            public int compare(Interval a, Interval b) {
                // Compare by start time first
                int startComparison = Integer.compare(a.start, b.start);
                if (startComparison != 0) {
                    return startComparison;
                }

                // If start times are equal, compare by end time
                return Integer.compare(a.end, b.end);
            }
        };

        // Sort the array using the custom comparator.
        Arrays.sort(intervals, numComparator);
        // Non Overlapping Condition: e1 < s2
        int n = intervals.length;
        Interval[] ans = new Interval[n];
        int s1 = intervals[0].start;
        int e1 = intervals[0].end;
        int idx = 0;
        for (int i = 1; i < n; i++) {
            int s2 = intervals[i].start;
            int e2 = intervals[i].end;
            if (e1 < s2) {
                ans[idx] = new Interval(s1, e1);
                s1 = s2;
                e1 = e2;
                idx++;
            } else {
                s1 = Math.min(s1, s2);
                e1 = Math.max(e1, e2);
            }
        }
        ans[idx] = new Interval(s1, e1);
        int size = 0;
        for (int i = 0; i < n; i++) {
            if (ans[i] != null)
                size++;
        }
        Interval[] answer = new Interval[size];
        for (int j = 0; j < size; j++) {
            answer[j] = ans[j];
        }
        return answer;
    }
}

// Debugging
// System.out.print("s1="+s1+", e1="+e1+", s2="+s2+", e2="+e2+", ");
// System.out.println("s1="+s1+", e1="+e1+", s2="+s2+", e2="+e2);
// System.out.println("idx="+idx+", s1="+s1+", e1="+e1);
// System.out.println(intervals.length);
// System.out.println(Arrays.toString(intervals));
// System.out.println(Arrays.toString(ans));
// System.out.println(ans.length);
// System.out.println(size + Arrays.toString(answer));

// Mistakes: NullPointerException
// ans[idx].start = s1;
// ans[idx].end = e1;
// ans[idx].start = s1;
// ans[idx].end = e1;
