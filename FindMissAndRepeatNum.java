package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindMissAndRepeatNum {

	static int[] findTwoElement(int arr[], int n) {
		int x = 0;
		for (int i = 0; i < n; i++) {
			x = x ^ arr[i];
		}
		int y = 0;
		for (int j = 1; j <= n; j++) {
			y = y ^ j;
		}
		int num = x ^ y;
		int setBitNo = num & ~(num - 1);
		/*
		** Now divide elements into two sets by comparing rightmost set bit of xor1 with
		** the bit at the same position in each element. Also, get XORs of two sets. The
		** two XORs are the output elements. The following two for loops serve the
		** purpose
		*/
		int b1 = 0, b2 = 0;
		for (int i = 0; i < n; i++) {
			if ((arr[i] & setBitNo) != 0)
				/* arr[i] belongs to first set */
				b1 = b1 ^ arr[i];

			else
				/* arr[i] belongs to second set */
				b2 = b2 ^ arr[i];
		}
		for (int i = 1; i <= n; i++) {
			if ((i & setBitNo) != 0)
				/* i belongs to first set */
				b1 = b1 ^ i;

			else
				/* i belongs to second set */
				b2 = b2 ^ i;
		}
		for (int i = 0; i < n; i++) {
			if (b2 == arr[i]) {
				int temp = b1;
				b1 = b2;
				b2 = temp;
			}
		}
		int[] answer = { b1, b2 };
		return answer;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine().trim());
			String[] str = br.readLine().split(" ");

			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(str[i]);
			}

			int[] ans = findTwoElement(a, n);
			System.out.println(ans[0] + " " + ans[1]);
		}
	}
}
