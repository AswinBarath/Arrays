package arrays;

public class GridUniquePaths {

	public static void main(String[] args) {

		System.out.println(uniquePaths(3, 7));
	}
	
	// Combinatorics solution
	public static int uniquePaths(int m, int n) {
		
		int N = n + m - 2;
		int r = m - 1;
		double res = 1;
		
		for(int i=1; i <= r; i++) {
			res = res * (N - r + i) / i;
		}
		
		return (int) res;
	}
	
	public static int countPathsRecursive(int i, int j, int n, int m) {
		if(i==(n-1) && j==(m-1)) return 1;
		if(i>=n || j>=m) return 0;
		
		else return countPathsRecursive(i+1, j, n, m) + countPathsRecursive(i, j+1, n, m);
	}

	public static int countPathsDP(int i, int j, int n, int m, int[][] dp) {
		if(i==(n-1) && j==(m-1)) return 1;
		if(i>=n || j>=m) return 0;
		
		if(dp[i][j]!=-1) return dp[i][j];
		else return dp[i][j] = countPathsDP(i+1, j, n, m, dp) + countPathsDP(i, j+1, n, m, dp);	
	}
}
