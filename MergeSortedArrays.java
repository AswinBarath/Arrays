package arrays;

import java.util.Scanner;

public class MergeSortedArrays {

	public static void main(String[] args) {
		
		/* Example
		   4
		   4 3 2 1
		   3 
		   10 8 6
		*/
		
		Scanner in = new Scanner(System.in);
//		System.out.println("Size of Array 1:");
		int n = in.nextInt();
//		System.out.println("Elements of array 1:");
		int[] arr1 = new int[n];
		for(int i=0; i<n; i++) {
			arr1[i] = in.nextInt();
		}
//		System.out.println("Size of Array 2:");
		int m = in.nextInt();
//		System.out.println("Elements of array 2:");
		int[] arr2 = new int[m];
		for(int i=0; i<m; i++) {
			arr2[i] = in.nextInt();
		}
		
		merge(n,m,arr1,arr2);
		
		for(int ele : arr1) {
			System.out.print(ele + " ");
		}
		System.out.println();
		for(int ele : arr2) {
			System.out.print(ele + " ");
		}
		
		in.close();
	}
	
	// Function to find the next gap.
	private static int nextGap(int gap) {
		if (gap <= 1)
			return 0;
		return (gap / 2) + (gap % 2);
	}			
	public static void merge(int n, int m, int[] arr1, int[] arr2 ) {
		int i, j, gap = n + m;
		for (gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {
			// comparing elements in the first array.
			for (i = 0; i + gap < n; i++)
				if (arr1[i] > arr1[i + gap]) {
					int temp = arr1[i];
					arr1[i] = arr1[i + gap];
					arr1[i + gap] = temp;
				}
			// comparing elements in both arrays.
			for (j = gap > n ? gap - n : 0; i < n && j < m; i++, j++)
				if (arr1[i] > arr2[j]) {
					int temp = arr1[i];
					arr1[i] = arr2[j];
					arr2[j] = temp;
				}
			if (j < m) {
				// comparing elements in the second array.
				for (j = 0; j + gap < m; j++)
					if (arr2[j] > arr2[j + gap]) {
						int temp = arr2[j];
						arr2[j] = arr2[j + gap];
						arr2[j + gap] = temp;
					}
				}
			}
		}
}
