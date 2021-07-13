package arrays;

public class RotateMatrix {

	public static void main(String[] args) {
		

	}
	
	public static void rotate(int[][] matrix) {
		transpose(matrix);
		reverse(matrix);
	}
	
	public static void transpose(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=i; j<matrix[0].length; j++) {
				int temp = 0;
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}
	
	public static void reverse(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=i; j<matrix.length/2; j++) {
				int temp = 0;
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length - 1 - j];
				matrix[i][matrix.length - 1 - j] = temp;
			}
		}
	}

}
