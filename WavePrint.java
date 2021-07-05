package Arrays;

public class WavePrint {

	public static void main(String[] args) {
		int[][] arr = {{11,12,13,14}, {21,22,23,24}, {31,32,33,34}, {41,42,43,44}};
		WavePrintClockWise(arr);
	}
	private static void WavePrintClockWise(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			if(i%2 == 0) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j] + ", ");
				}
			}
			else {
				for(int j=arr[i].length-1; j>=0; j--) {
					System.out.print(arr[i][j] + ", ");
				}
			}
		}
	}
}
