package arrays;

public class CountInversions {
	
	// merge() merges two sorted arrays and returns inversion count in the arrays  
	public static int merge(int[] arr, int[] temp, int left, int mid, int right)
	{
		int i, j, k;
		int inv_count = 0;
		
		i = left; // i is index for left sub array
		j = mid;  // j is index for right sub array 
		k = left; // k is index for resultant merged sub array
		while((i <= mid - 1) && (j <= right)) {
			if(arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
				
				inv_count = inv_count + (mid - i);
			}
		}
		
		while(i <= mid - 1)
			temp[k++] = arr[i++];
		
		while(j <= right)
			temp[k++] = arr[j++];
		
		for(i = left; i <= right; i++)
			arr[i] = temp[i];
		
		return inv_count;
	}
	
	public static int mergeSort(int[] arr, int[] temp, int left, int right) {
		int mid, inv_count = 0;
		if(right > left) {
			mid = (right + left) / 2;
			
			inv_count += mergeSort(arr, temp, left, mid);
			inv_count += mergeSort(arr, temp, mid+1, right);
			
			inv_count += merge(arr, temp, left, mid+1, right);
		}
		return inv_count;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 20, 6, 4, 5 };
		
		int[] temp = new int[arr.length];

		System.out.println(mergeSort(arr, temp, 0, arr.length - 1));
	}

}
	