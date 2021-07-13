package arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};
		List<Integer> res = majorityElement(arr);
		System.out.println(res);
	}
	
    public static List<Integer> majorityElement(int[] nums) {
        int ele1 = 0, ele2 = 0, c1 = 0, c2 = 0;
        
        for(int n: nums) {
            if(n == ele1) c1++;
            else if(n == ele2) c2++;
            else if(c1 == 0) {
                ele1 = n;
                c1++;
            } else if(c2 == 0) {
                ele2 = n;
                c2++;
            } else {
                c1--;
                c2--;
            }
        }
        
        // verification step
        c1 = 0; c2 = 0;
        for(int n : nums) {
            if(n==ele1) c1++;
            else if(n == ele2) c2++;
        }
        
        List<Integer> ans = new ArrayList<>();
        if(c1 > nums.length / 3) ans.add(ele1);
        if(c2 > nums.length / 3) ans.add(ele2);
        return ans;
    }

}
