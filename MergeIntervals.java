package arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {

	public static void main(String[] args) {

		int arr[][] = {{1,3},{2,6},{8,10},{15,18}};

		int[][] res = mergeIntervals(arr);
		for(int[] i : res) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
	
	public static int[][] mergeIntervals(int[][] intervals) {
		List<int[]> res = new ArrayList<>();
		
		if(intervals.length == 0 || intervals == null) {
			return res.toArray(new int[0][]);
		}
		
		Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
		
		int start = intervals[0][0];
		int end = intervals[0][1];
		
		for(int[] i : intervals) {
			if(i[0]<=end) {
				end = Math.max(end, i[1]);
			}
			else {
				res.add(new int[] {start, end});
				start = i[0];
				end = i[1];
			}
		}
		
		res.add(new int[] {start, end});
		return res.toArray(new int[0][]);
	}

}
