package arrays;

import java.util.Scanner;

public class MaximumSubarraySum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Size of Array:");
		int n = in.nextInt();
		System.out.println("Elements of array:");
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("Maximum sum="+maxSubArray(arr));
		in.close();
	}
	
	public static int maxSubArray(int[] arr) {
		int sum = 0;
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			if(sum > max) max = sum;
			if(sum < 0) sum = 0;
		}
		return max;
	}

}
