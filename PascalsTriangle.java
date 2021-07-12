package arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class PascalsTriangle {

	public static void main(String[] args) {
//		System.out.println(generateCurr(5, 3));
		System.out.println(getRow(3));
		generateNthRow(3);
	}
	
	// Type III
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row, pre = null;
        for(int i=0; i < numRows; ++i) {
            row = new ArrayList<Integer>();
            for(int j=0; j<=i; ++j) {
                if(j == 0 || j == i)
                    row.add(1);
                else
                    row.add(pre.get(j-1) + pre.get(j));
            }
            pre = row;
            res.add(row);
        }
        return res;
	}
	
	// Type II
	public static List<Integer> getRow(int k) {
		Integer[] arr = new Integer[k + 1];
        Arrays.fill(arr, 0);
        arr[0] = 1;
        
        for (int i = 1; i <= k; i++) 
            for (int j = i; j > 0; j--) 
                arr[j] = arr[j] + arr[j - 1];
        
        return Arrays.asList(arr);
        
		// Gives error for bigger values:
//        List<Integer> res = new ArrayList<>();
//        int N = k;
//        int curr = 1;
//        res.add(curr);
//		for(int i = 0 ; i < N ; i++) {
//			curr = curr * (N - i);
//			curr = curr / (i + 1);
//			res.add(curr);
//		}
//        return res;
    }
	
	public static void generateNthRow(int N) {
		int res = 1;
		System.out.print(res + " ");
		for(int i = 0 ; i < N ; i ++) {
			res *= (N - i);
			res /= (i + 1);
			System.out.print(res + " ");
		}
	}

	// Type I
//	public static int generateCurr(int R, int C) {
//		int res = 1;
//		for(int i=0; i<(R/2); i++) {
//			res *= (R-i);
//			res /= (i+1);
//		}
//		return res;
//	}
}
