package scaler_problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */


public class MergeInvervals {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        intervals.add(newInterval);
        return merge(intervals);
    }
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
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
        Collections.sort(intervals, numComparator);
        // Non Overlapping Condition: e1 < s2
        int n = intervals.size();
        ArrayList<Interval> ans = new ArrayList<Interval>();
        int s1 = intervals.get(0).start;
        int e1 = intervals.get(0).end;
        for(int i=1; i<n; i++) {
            int s2 = intervals.get(i).start;
            int e2 = intervals.get(i).end;
            if(e1 < s2) {
                ans.add(new Interval(s1,e1));
                s1 = s2;
                e1 = e2;
            }
            else {
                s1 = Math.min(s1, s2);
                e1 = Math.max(e1, e2);
            }
        }
        ans.add(new Interval(s1,e1));
        ArrayList<Interval> answer = new ArrayList<Interval>();
        for(int j=0; j<ans.size(); j++) {
            answer.add(ans.get(j));
        }
        return answer;
    } 
}
