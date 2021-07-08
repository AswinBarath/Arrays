package Arrays;

public class Sort012 {
	public void sortColors(int[] nums) {
		int low = 0, mid = 0, high = nums.length - 1;
		int temp;
		while (mid <= high) {
			switch (nums[mid]) {
			case 0: {
				temp = nums[mid];
				nums[mid] = nums[low];
				nums[low] = temp;
				mid++;
				low++;
				break;
			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;
				high--;
				break;
			}
			}
		}
	}
}
