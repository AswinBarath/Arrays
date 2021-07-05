package Arrays;

public class MaxVal {

	public static void main(String[] args) {

		int[] arr = {10, 20, 30, 50, 40};
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Maximum: " + max);

	}

}
