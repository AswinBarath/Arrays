package arrays;

public class MajorityElement_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};
		System.out.println(majorityElement(arr));

	}
	
	public static int majorityElement(int[] nums) {
		int count = 0;
		int candidate = 0;
		
		for(int num : nums) {
			if(count == 0) {
				candidate = num;
			}
			if(num == candidate) count += 1;
			else count -= 1;
		}
		
		return candidate;
	}
}
