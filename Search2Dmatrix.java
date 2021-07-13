package arrays;

public class Search2Dmatrix {

	public static void main(String[] args) {

		int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		System.out.println(searchMatrix(arr, 13));
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
		if(matrix.length == 0) return false;
		
		int n = matrix.length;
		int m = matrix[0].length;
		
		int lo = 0;
		int hi = (n * m) - 1;
		
		while(lo <= hi) {
			int mid = (lo+ (hi - lo) / 2);
			if(matrix[mid/m][mid%m] == target) {
				return true;
			}
			if(matrix[mid/m][mid%m] < target) {
				lo = mid + 1;
			}
			else {
				hi = mid - 1;
			}
		}
		
        return false;
    }

}
