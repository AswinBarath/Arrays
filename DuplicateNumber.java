package Arrays;

import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of the array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Array elements:");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(findDuplicate(arr));
		
		sc.close();
	}
	
	public static int findDuplicate(int[] nums) {
        // Find the intersection point of the two runners.
        int tort = nums[0];
        int hare = nums[0];
        do {
            tort = nums[tort];
            hare = nums[nums[hare]];
        } while (tort != hare);
        
        // Find the "entrance" to the cycle.
        tort = nums[0];
        while(tort != hare) {
            tort = nums[tort];
            hare = nums[hare];
        }
        return tort;
    }

}
