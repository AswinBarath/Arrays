package arrays_practice;

public class Swap {

	public static void main(String[] args) {
		// declare
		int[] arr = null;

		// allocate space
		arr = new int[5];

		// set
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		int i = 0, j = 2;

		System.out.println(arr[i] + ", " + arr[j]);
		Swap_1(arr[i], arr[j]); // not working swap
		Swap_2(arr, i, j); // Working swap function
		System.out.println(arr[i] + ", " + arr[j]);
		int[] other = { 100, 200, 300 };
		System.out.println(arr[0] + ", " + other[0]);
		Swap_3(arr, other);
		System.out.println(arr[0] + ", " + other[0]);

	}

	public static void Swap_3(int[] one, int[] two) {
		int[] temp = one;
		one = two;
		two = temp;
	}

	public static void Swap_2(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void Swap_1(int one, int two) {
		int temp = one;
		one = two;
		two = temp;
	}

}
