package arrays;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 5, 4, 3};
		nextPermutation(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
	}
	
	public static void nextPermutation(int[] A) {
        if(A == null || A.length <= 1) return;
        
        // Start finding the breakpoint from the second last index
        int i = A.length - 2;
        while(i >= 0 && A[i] >= A[i+1]) i--;
        
        // Only if we obtain the breakpoint we run the below if condition
        if(i>=0) {
            int j = A.length - 1;
            while(A[j] <= A[i]) j--;
            swap(A, i, j);
        }
        // If i<0 (edge case) then entire array is reversed
        // Else from right to i, everything is reversed
        reverse(A, i+1, A.length - 1);
    }
    
    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    
    public static void reverse(int[] A, int i, int j) {
        while(i < j) swap(A, i++, j--);
    }

}
